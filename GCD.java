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








š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
