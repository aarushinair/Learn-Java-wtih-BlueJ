import java.io.*;
import java.lang.Math.*;
public class binary_decimal
{
   public static void main(String args[])throws IOException{
       int num;
       BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Enter a binary number,binary only");
       num=Integer.parseInt(br.readLine());
       int sum=0;
       int m=1;
       for(int i=0;num>0;num++){
           double s=num%10;
           if(s>1){             
               m=0;
            }           
           s=s*Math.pow(2,i);
           sum = (int) (sum+s);
           num=num/10;
        }
        if (m==1){
        System.out.println(sum);
      }
      else{
          System.out.println("Invalid Number");
        }
    }
  }
