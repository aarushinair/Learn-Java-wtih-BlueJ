import java.io.*;
import java.util.*;
public class token3
{
   public static void main (String args[]) throws IOException{
       BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Enter a file name");
       String file=br.readLine();
       FileReader fr=new FileReader (file);
       BufferedReader br2=new BufferedReader(fr);
       String word="";
       while((word =br2.readLine())!=null){
           StringTokenizer st=new StringTokenizer (word);
           while(st.hasMoreTokens()){
            String w2=st.nextToken();
            System.out.println(w2);
        }
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
