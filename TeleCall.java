import java.io.*;
public class TeleCall
{
   String phno;
   String name;
 int n;
   double amt;
   TeleCall(String na,String p,int num,double a)
   {                                            
       phno=p;
       name=na;
      n=num;
      amt=a;
    }
    void compute(){
        if(n>=1&&n<=100){
            amt=500.0;
        }
        else if(n>=101&&n<=200){
            amt=(1.00*n)+500;
        }
        else if(n>=201&&n<=300){
            amt=(1.20*n)+500;
        }
        else{
            amt=(1.50*n)+500;
        }
    }
    void displaydata(){
        System.out.println("Phone Number\tName\tTotal Calls\tAmount");
        System.out.println(phno+"\t"+name+"\t"+n+   "\t"+amt);
    }
    public static void main (String args[])throws Exception{
        TeleCall ob=new TeleCall("Aryan","89573539",205,0.0);
        ob.compute();
        ob.displaydata();
    }      
}










/*
👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
*/
