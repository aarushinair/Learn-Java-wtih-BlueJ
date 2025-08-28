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
