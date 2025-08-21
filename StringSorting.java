import java.io.*;
public class StringSorting
{
    public static void main (String args[])throws IOException{
        int p=0;
        String [] names = new String [15];
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter 15 names");
        for(int i=0;i<15;i++){
            names[i]=br.readLine();
        }
        for(int k=0; k<15;k++){
            for(int j=0;j<14-p-1;j++){
                String a= names[j].toLowerCase();
                String c= names[j+1].toLowerCase();
               if(a.compareTo(c)>0){
                   String b=a;
                  names[j]=names[j+1];
                  names[j+1]=b;
                }
           }
         }
         System.out.println("The new list is:");
         for(int v=0;v<15;v++){
             System.out.println(names[v]);
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
