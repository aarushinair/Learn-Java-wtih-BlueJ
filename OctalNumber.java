import java.io.*;
import java.util.*;
public class DeciOct
{
    int n;
    double oct;
    static int l;
    DeciOct(){
        n=0;
        oct=0.0;
        l=0;
    }
    void getnum(int nn){
        n=nn;
    }
    void deci_oct(){
        int r=0,d=0;
                if(n/8==0){
            r=n%8;
            oct=oct+r*Math.pow(10,l-1);
        }
        else{
           d=n/8;
           r=n%8;
          oct=oct+r*Math.pow(10,l-1);
          l--;
          d=n;
          deci_oct();
        }
    }
    void show(){
        System.out.println("Decimal number:\t"+n);
        deci_oct();
        System.out.println("Octal equivalent:\t"+oct);
    }
    public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DeciOct ob=new DeciOct();
        System.out.println("Enter a number");
        int nn=Integer.parseInt(br.readLine());
        ob.getnum(nn);
        while(nn>0){
            l++;
            nn=nn/10;
        }
        ob.show();
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
