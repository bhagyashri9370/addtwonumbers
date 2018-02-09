import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
 
public interface cal()
{
	public int a,b;
	public void getexp(int a,int b);
}
public class MyServer implements cal
{	
	public static int add(int a, int b){
		 int r = a + b;
		 return r;
	}public static int sub(int a, int b){
		 int r = a - b;
		 return r;
	}
	public static int mul(int a, int b){
		 int r = a * b;
		 return r;
	}
	public static int div(int a, int b){
		 int r = a / b;
		 return r;
	}
    public static void main(String args[]) throws IOException
    {
 
        // Step 1: Establish the socket connection.
        ServerSocket ss = new ServerSocket(4444);
        Socket s = ss.accept();
 
        // Step 2: Processing the request.
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
 
        while (true)
        {
            // wait for input
            String input = dis.readUTF();
 
            if(input.equals("bye")){
				dis.close();
				dos.close();
				break;
			}
 
            System.out.println("Equation received:-" + input);
            int result;
 
            // Use StringTokenizer to break the equation into operand and
            // operation
            StringTokenizer st = new StringTokenizer(input);
 
            int oprnd1 = Integer.parseInt(st.nextToken());
            String operation = st.nextToken();
            int oprnd2 = Integer.parseInt(st.nextToken());
 
            // perform the required operation.
            if (operation.equals("+"))
            {
                result = add(oprnd1, oprnd2);
            }
 
            else if (operation.equals("-"))
            {
                result = sub(oprnd1, oprnd2);
            }
            else if (operation.equals("*"))
            {
                result = mul(oprnd1, oprnd2);
            }
            else
            {
                result = div(oprnd1, oprnd2);
            }
            System.out.println("Sending the result...");
 
            // send the result back to the client.
            dos.writeUTF(Integer.toString(result));
        }
    }
	
}
