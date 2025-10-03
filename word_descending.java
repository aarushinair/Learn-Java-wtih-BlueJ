import java.io.*;
public class word_descending
{
   public static void main (String args [])throws IOException{
       String word;
       int i,j;
       char tmp;
       BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Enter a word");
       word=br.readLine();
       int l=word.length();
       char [] arr=new char[l];
       for (int c=0;c<l;c++){
           arr[c]= word.charAt(c);
        }
        for(i=0;i<l;i++){
            for (j=0;j<l-1;j++){
                if(arr[j]<arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println("The word in descending order is:");
        for(i=0;i<l;i++){
            System.out.print (arr[i]);
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
