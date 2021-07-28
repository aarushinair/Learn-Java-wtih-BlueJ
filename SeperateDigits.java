import java.io.*;
class separateDigits
{
 static void main()throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int i;
     String a;
     System.out.print("Enter the number : ");
     a=br.readLine();
     System.out.print("\nThe digits are : ");
     for(i=0;i<=a.length()-1;i++)
     {
         System.out.print(a.charAt(i));
         if(i!=a.length()-1)
         System.out.print(" , ");
         else
         System.out.print(" .");
        }
    }
}
