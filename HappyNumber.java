import java.io.*;
import java.lang.*;
public class Happy
{
    static int n=0;
    public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a number");
        n=Integer.parseInt(br.readLine()); 
        int res=sumOfdigits(n);
        while(res>9){
           int fin=res;
            res=sumOfdigits(fin);
        }
        if (res==1)
        {
            System.out.println("The number is a happy number");
        }
        else{
            System.out.println("the number is not a happy number");
        }
    } 
   static int sumOfdigits(int num){
        int d,sum=0;
       while (num>0){
            d=num%10;
            sum=sum+(int)Math.pow(d,2);
            num=num/10;
        }
        return sum;
    }
}







š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
