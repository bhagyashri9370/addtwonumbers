import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
class UI{
	int a;
	int b;
	
	void setij(int x, int y){
			a = x;
			b = y;
	}
}

class BI extends UI{
	int r ;	 
	void add(){
		 r = a + b;
	}
	void sub(){
		 r = a - b;
	}
	void mul(){
		 r = a * b;
	}
	void div(){
		 r = a / b;
	}
}

class Calculator{
	public static void main(String args[]){
		BI obj = new BI();
		Scanner sc = new Scanner(System.in);
		int result;
		int op1;
		int op2;
		
		while(true){
			
		System.out.print("Enter the equation in the form: ");
            System.out.println("'operand operator operand'");
 
            String inp = sc.nextLine();
			if (inp.equals("bye"))
                break;
			StringTokenizer st = new StringTokenizer(inp);
 
            op1 = Integer.parseInt(st.nextToken());
            String operation = st.nextToken();
            op2 = Integer.parseInt(st.nextToken());
		obj.setij(op1, op2);
		if (operation.equals("+"))
            {
                obj.add();
				System.out.println("Result : " +obj.r);
            }
 
            else if (operation.equals("-"))
            {
                obj.sub();
				System.out.println("Result : " +obj.r);
            }
            else if (operation.equals("*"))
            {
                obj.mul();
				System.out.println("Result : " +obj.r);
            }
            else
            {
                obj.div();
				System.out.println("Result : " +obj.r);
            }
		}
	
	}
}