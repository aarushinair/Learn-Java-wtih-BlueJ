import java.util.*;
public class acceptscanner
{
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 5 names");
        String arr[]=new String [5];
        for(int i=0;i< 5;i++){
            if (sc.hasNext ()){
                arr[i]= sc.next();
            }
        }
        System.out.println("The names are:");
        for(int c=0;c<5;c++){
            System.out.println(arr[c]);
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
