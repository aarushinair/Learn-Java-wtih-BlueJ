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
👋 Hi, I’m @aarushinair — Aarushi Nair (she/her)
🎓 CS Engineer | AI Researcher | Software Engineer | DEI Professional
💡 Interests: AI/ML/DL, Responsible Tech, Innovative Technologies, Ethics in AI
🌍 Advocate for Women in Tech | Community & Events Manager @AnitaB.org India
🎙️ Speaker | Content Creator | STEM Mentor
📫 Let’s connect: https://www.linkedin.com/in/aarushinair/
📹 YouTube: Code with Aarushi → https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🐦 Twitter/X: https://x.com/aarushinair_
📁 Portfolio, projects & talks: https://github.com/aarushinair
*/
