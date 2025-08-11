import java.io.*;
class separateDigits
{
 static void main()throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int i;
     String a;
     System.out.print("Enter the number : ");
     a=br.readLine();
     System.out.print("\nThe digits are : ");
     for(i=0;i<=a.length()-1;i++)
     {
         System.out.print(a.charAt(i));
         if(i!=a.length()-1)
         System.out.print(" , ");
         else
         System.out.print(" .");
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
