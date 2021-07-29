/**
 * To check if a number is a legal ISBN number or not.
 */
import java.io.*;
public class ISBN
{
    long n,t,rev=0,d,s=0;
    int c=0,x=1;
    void display () throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a no.");
        n=Long.parseLong(br.readLine());
        t=n;
        while(t>0){
            c++;
            t=t/10;
        }
        if(c!=10){
            System.out.println("Illegal ISBN");
            System.exit(0);
        }
        else{
            while(n>0){
               d=n%10;
               rev=rev*10+d;
               n=n/10;
            }
            while(rev>0){
                d=rev%10;
                s=s+x*d;
                x++;
                rev=rev/10;
            }
            if(s%11==0){
                System.out.println("Legal ISBN");
            }
            else{
                System.out.println("Illegal ISBN");
            }
        }
    }
}
/*
 * Variable Description Table
 * 
 * Variable Name            Datatype            Description
 * c                        int                 used in while loop
 * x                        int                 used in while loop
 * t                        long                to store the remainder of input number
 * n                        long                to store input number
 * rev                      long                used in while loop
 * d                        long                used in while loop
 * s                        long                used in while loop
 */








👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
