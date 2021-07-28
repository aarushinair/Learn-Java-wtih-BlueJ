import java.io.*;
public class MathematicalFunction
{
   public static void main(String args[]) throws IOException{
       BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Enter your number");
       double a= Double.parseDouble(br.readLine());
       System.out.println("Enter the power to be raised");
       double b=Double.parseDouble(br.readLine());
       System.out.println("Math.pow("+a+","+b+"="+Math.pow(a,b));
       System.out.println("Logarithm of the number");
       System.out.println("Math.log("+a+")="+Math.log(a));
       System.out.println("Square root of the number");
       System.out.println("Math.sqrt("+a+")="+Math.sqrt(a));
       System.out.println("The ceil() of the number");
       System.out.println(Math.ceil(a));
       System.out.println("The  floor() of the number");
       System.out.println(Math.floor(a));
       System.out.println("The closest value to the number is:");
       System.out.println(Math.rint(a));
       System.out.println("The absolute value of the number");
       System.out.println(Math.abs(a));
       System.out.println("The greatest number between"+a+ "and" +b+ "is:");
       System.out.println(Math.max(a,b));
       System.out.println("The smallest number between"+a+"and"+b+"is:");
       System.out.println(Math.min(a,b));
       
    }
  }
