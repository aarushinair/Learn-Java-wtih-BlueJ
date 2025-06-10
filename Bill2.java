import java.io.*;
public class Bill extends Detail
{
    int n;
    double amt;
    Bill(String nm,String a,int tel,int r,int no,double amount){
        super(nm,a,tel,r);
        n=no;
        amt=amount;
    }
    void cal(){
        if (n>=1&&n<=100){
            amt=rent;
        }
        else if (n>=101&&n<=200){
            amt=(0.6*n)+rent;
        }
        else if (n>=201&&n<=300){
            amt=(0.8*n)+rent;
        }
        else{
            amt=n+rent;
        }
    }
    void show(){
        super.show();
        cal();
        System.out.println("The Amount in Rupees is:\t"+amt);
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter Number of Calls");
        int calls=Integer.parseInt(br.readLine());
        Bill ob=new Bill ("Aarushi","Moon",7838088,3000,calls,0.0);
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
