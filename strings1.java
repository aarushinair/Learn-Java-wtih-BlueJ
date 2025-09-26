import java.io.*;
public class Strings1 { 
    public static void main (String args []) throws IOException  {
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    System.out.println("Enter a word");
    String a=br.readLine();
    String m=a;
    String q=a.toUpperCase();
    int b=q.length();
    char [ ] a1=new char [b];
    int [ ] a2= new int[b];
    for(int i=0; i<b;i++){
    a1[i]=q.charAt(i);
    System.out.println(" Character  " + a1[i]);
    int y=a1[i];
    a2[i]=y;
    System.out.println(" Ascii   " + a2[i]);
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
