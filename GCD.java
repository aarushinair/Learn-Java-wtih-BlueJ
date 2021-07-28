import java.io.*;
public class GCD
{
   static int gcd(int x,int y){
       if(y==0){
           return x;
        }
        else{
            int r=x%y;
            return gcd(y,r);
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter two numbers");
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
        int f=gcd(x,y);
        System.out.println("The HCF of the two numbers is:\t"+f);
    }
}
