/**
 * Write a description of class Automorphic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Automorphic
{
   public static void main (String args[]) throws IOException{
       BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Enter a no.");
      int n=Integer.parseInt(br.readLine());
       int s=n*n;
       int flag=0;
       while(n>0){
           if(n%10 != s%10){
               flag=1;
               break;
            }
            else{
                n=n/10;
                s=s/10;
            }
        }
        if(flag==0){
            System.out.println("Automorphic no.");
        }
        else{
            System.out.println("Not an Automorphic no.");
        }
    }
}











/*
👋 Hi, I’m @aarushinair — Aarushi Nair (she/her)
🎓 CS Engineer | AI Researcher | Software Engineer | DEI Professional
💡 Interests: AI/ML/DL, Responsible Tech, Innovative Technologies, Ethics in AI
🌍 Advocate for Women in Tech | Community Manager @AnitaB.org India
🎙️ Speaker | Content Creator | STEM Mentor
📫 Let’s connect: https://www.linkedin.com/in/aarushinair/
📹 YouTube: Code with Aarushi → https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🐦 Twitter/X: https://x.com/aarushinair_
📁 Portfolio, projects & talks: https://github.com/aarushinair
*/
