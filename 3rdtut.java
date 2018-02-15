import java.io.*;
import java.util.scanner;
import java.util.*;

public interface Userinterface {
	public string exp;
	public void getExp();
}
public interface algebric
{
	public void max();
	public void min();
	public var();

}
public interface geometric_op
{
	public void sin();
	public void cos();
	public void tan();
}

public class basic_calculator
{
	protected void op(float a,float b)
	{
		first_no =a;
		second_no=b;
	}
	
}
public class algebric_op implements algebric
{
	protected void op(float a,float b)
	{
		first_no =a;
		second_no=b;
	}
}
public class algebric_op implements geometric
{
	protected void op(float a,float b)
	{
		first_no =a;
		second_no=b;
	}
}
public class calinterfacel implements userinterface extends basic_calculator,algebric_op,geometric_op
{
	public void getvalue()
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers : ");
	firstno = in.nextInt();
	secondno = in.nextInt();
	}
	/*private string eveluate_exp;
	private int result;*/
	
	
	
	public void add() {
		res = firstno + secondno;
        System.out.print("Result = " + res);
	
	}
	
	public void sub() {
		res = firstno - secondno;
        System.out.print("Result = " + res);
	
	}
	
	public void mul() {
		res = firstno * secondno;
        System.out.print("Result = " + res);
	
	}
	
	public void div() {
		res = firstno / secondno;
        System.out.print("Result = " + res);
	
	}
}

public class UI extends BL implements cal_interface
{
	char choice, ch;
		public void getExp()
		{
        Scanner scan = new Scanner(System.in);
		
        do
        {
            System.out.print("1. Addition\n");
            System.out.print("2. Subtraction\n");
            System.out.print("3. Multiplication\n");
            System.out.print("4. Division\n");
            System.out.print("5. Exit\n\n");
            System.out.print("Enter Your Choice : ");
            choice = scan.next().charAt(0);
            switch(choice)
            {
                case '1' :
					add();
                    break;
                case '2' :
					sub();
                    break;
                case '3' : 
					mul();
                    break;
                case '4' : 
					div();
					break;
                case '5' : 
					System.exit(0);
                    break;
                default : 
					System.out.print("Wrong Choice!!!");
                    break;
            }
            System.out.print("\n---------------------------------------\n");
        }while(choice != 5);  
		}		
    
	public static void main(string arg[])
	{
		cal_interface c1=new BL();
		BL b1=new UI();
		UI u1=new UI();
		b1.getvalue();
		b1.getExp();
	}
}