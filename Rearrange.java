import java.io.*;
public class Rearrange
{
   String txt;
   String cxt;
   int len;
   Rearrange(){
       txt="";
       cxt="";
       len=0;
    }
    void readWord() throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a word");
        txt=br.readLine();
        txt=txt.toUpperCase();
    }
    void convert(){
        String s=txt+" ";
        len=s.length();
        char ch;
        for (int i=0;i<len;i++){
        ch=s.charAt(i);
        if((i==0)&&(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
            cxt=txt+"Y";
            break;
        }
         else if((i!=0)&&(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
            cxt=txt.substring(i,len-1)+txt.substring(0,i)+"C";
          break;
        }
        else {
           cxt = txt+"N";
          break;
       }
    }
}
    void display(){
        System.out.println("The original word is :\t"+txt);
        System.out.println("The changed word is :\t"+cxt);
    }
    public static void main (String args[])throws IOException{
       BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
       Rearrange ob=new Rearrange ();
       ob.readWord();
       ob.convert();
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
