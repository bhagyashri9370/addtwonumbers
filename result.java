import java.io.*; 
public class result { 
    public static void main(String args[])throws IOException{  
      factory ffactory = new factory();  
        
      System.out.print("Enter the name of calculationtype for which the result will be generated: ");  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
      String calculation=br.readLine();  
      System.out.print("Enter the number: ");  
      int number=Integer.parseInt(br.readLine()); 
      calculator c = ffactory.getcalculator(calculation);  
       System.out.print("calculation is:");  
           c.getcontent();  
           c.calculateresult(number);  
            }  
}
