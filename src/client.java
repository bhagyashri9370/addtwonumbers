import java.util.Scanner;

import java.net.Socket;

import java.io.BufferedInputStream;

import java.io.DataInputStream;

import java.io.DataOutputStream;

import java.io.IOException;

import java.net.UnknownHostException;

import java.util.*;



public class client

{

private Socket socket = null;

private DataInputStream input = null;

private DataInputStream in = null;

private DataOutputStream out = null;



public client(String address, int port)

{



try

{

socket = new Socket(address, port);

System.out.println("Client Connected");



input = new DataInputStream(System.in);



out = new DataOutputStream(socket.getOutputStream());



in=new DataInputStream(

new BufferedInputStream(socket.getInputStream()));

}

catch(UnknownHostException u)

{

System.out.println(u);

}

catch(IOException i)

{

System.out.println(i);

}



String text = "";

Scanner sc=new Scanner(System.in);

Stack<Double> res = new Stack<Double>();



try

{



System.out.println("Enter an expression:");



while(!text.equals("done"))

{

text = sc.nexttext();

out.writeUTF(text);

double answer=0.0;

answer = Double.parseDouble(in.readUTF());

System.out.println("Answer is "+answer);

res.push(answer);

}



}

catch(IOException i)

{

System.out.println(i);

}





try

{

System.out.println("Your all answers are");

while (!res.isEmpty()){

System.out.println(res.pop());

}

input.close();

out.close();

socket.close();

}

catch(IOException i)

{

System.out.println(i);

}

}



public static void main(String args[])

{

client cli = new client("127.0.0.1", 5000);

}

}

