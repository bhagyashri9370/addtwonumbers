import java.util.Scanner;
public class algebric extends calculator{
	public void getcontent() 
	{
int min, max;

Scanner s = new Scanner(System.in);
System.out.print("Enter a Value: ");
int val = s.nextInt();
min = max = val;

while (val != 0) {
  System.out.print("Enter a Value: ");
  val = s.nextInt();
  if (val < min) {
      min = val;
  }
  if (val > max) {
     max = val;
  }
};
System.out.println("Min: " + min);
System.out.println("Max: " + max);
}
}