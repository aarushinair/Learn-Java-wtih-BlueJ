import java.io.*;
public class GCD
{
   static int gcd(int x,int y){
       if(y==0){
           return x;
        }
        else{
            int r=x%y;
            return gcd(y,r);
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter two numbers");
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
        int f=gcd(x,y);
        System.out.println("The HCF of the two numbers is:\t"+f);
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
