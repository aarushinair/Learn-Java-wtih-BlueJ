import java.io.*;
import java.util.*;
public class SeriesSum
{
   int n;
   int x;
   double sum;
   SeriesSum(int xx, int nn){
       x=xx;
       n=nn;
       sum=0;
    }
    double findFact(int m){
        if (m<2){
            return 0;
        }
        else{
            int f=1;
            for (int i=m-1;i>1;i--){
                f=f*i;
            }
            return (Math.pow(x,m)/f )+ findFact (m-2);
        }
    }
    void calculate(){
        sum=sum+findFact(n);
    }
    void display(){
        System.out.println("The sum of the series is:\t"+sum);
    }
    public static void main (String args[]) throws IOException{
       BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Enter value of number and number of terms respectively");
       int xx=Integer.parseInt(br.readLine());
       int nn=Integer.parseInt(br.readLine());
       SeriesSum ob=new SeriesSum(xx,nn);
       ob.calculate();
       ob.display();
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
