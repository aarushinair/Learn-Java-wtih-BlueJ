import java.io.*;
public class Fibonacci_2D
{
   public static void main (String args[]) throws IOException{
       BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Enter the row and column respectively");
       int m=Integer.parseInt (br.readLine());
       int n=Integer.parseInt (br.readLine());
       int f=m*n;
       int arr[][]=new int [m][n];
       int a1[]=new int [f];
       int i=0;
       int j=1;
       a1[0]=i;
       a1[1]=j;
       int k=0;
       int pos=2;
       while (k!=(f-2)){
           int c=i+j;
           a1[pos]=c;
           pos++;
           i=j;
           j=c;
           k++;
        }
       pos=0;
       for (i=0;i<m;i++){
           for (j=0;j<n;j++){
               arr[i][j]=a1[pos];
               pos++;
            }
        }
        for (i=0;i<m;i++){
           for (j=0;j<n;j++){
               System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}











👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
