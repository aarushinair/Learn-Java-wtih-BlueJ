import java.io.*;
import java.util.*;
public class reverse_number
{
    int rev(int n,int l){
        if (l==1){
            return n;
        }
        else{
            int d=n%10;
            n=n/10;
            return d*(int)Math.pow(10,l-1)+rev(n,l-1);
        }
        
    }
    public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        reverse_number obj=new reverse_number();
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        int m=n;
        int len=0;
        while(m>0){
            int d=m%10;
            len++;
            m=m/10;
        }
        int num=obj.rev(n,len);
        System.out.println("Reversed number\t"+num);
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
