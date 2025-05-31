import java.io.*;
public class checkPrime {
  
  public static void main (String args[])throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the number");
       int n=Integer.parseInt(br.readLine());
       int m = n/2;
       int flag = 0;
     if(n==0||n==1){  
             System.out.println(n+" is not prime number");      
          }
     else{  
         for(int i=2;i<=m;i++){      
               if(n%i==0){      
                   System.out.println(n+" is not prime number");      
                    flag=1;      
                    break;      
                   }      
               }      
         if(flag==0){
            System.out.println(n+" is prime number");
         }  
     }  
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
