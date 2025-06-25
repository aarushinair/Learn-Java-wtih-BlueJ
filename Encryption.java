import java.io.*;
import java.lang.*;
public class Encryption
{
  String message;
  String EncMsg;
  Encryption(){
      message="";
      EncMsg="";
     }
  void readMessage() throws IOException{
      BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
      System.out.println("Enter a word");
      message=br.readLine();
    }   
    String rot13(String s){
        int l=s.length();
        char c[]=new char[l];
        for (int i=0;i<l;i++){
            c[i]=s.charAt(i);
            int v=(int)c[i];
                if (v>=110){
                v=v-13;
            }
            else{
                v=v+13;
            }
            c[i]=(char)v;
        }
        s="";
        for(int i=0;i<l;i++){
            s=s+c[i];
        }
        return s;
    }
    void encrypt(){
        EncMsg=rot13(message);
    }
    void display (){
        System.out.println("The original string:\t"+message);
        System.out.println("The encrypted string:\t"+EncMsg);
    }
    public static void main (String args[]) throws IOException{
        Encryption ob=new Encryption ();
        ob.readMessage();
        ob.encrypt();
        ob.display();
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
