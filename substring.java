import java.io.* ;
public class substring {
   public static void main (String args[]) throws IOException {
       BufferedReader br = new BufferedReader (new InputStreamReader (System.in)) ;
       System.out.println ("Enter a name:") ;
       String name = br.readLine() ;
       String f = name.toLowerCase() ;
       int l = f.length() ;
       for ( int x = l ; x >= 0 ; x--) {
           System.out.println (f.substring(0,x));
          
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
