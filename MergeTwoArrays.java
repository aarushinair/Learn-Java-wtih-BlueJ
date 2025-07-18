/**
 * To merge two arrays and print its output.
 */
import java.io.*;
public class merge
{
    public static void main (String args[]) throws IOException{
        int P[]=new int[6];
        int Q[]=new int [4];
        int R[]=new int [10];
        int i,j;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter 6 numbers");
        for(i=0;i<6;i++){
            P[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter 4 numbers");
        for (i=0;i<4;i++){
            Q[i]=Integer.parseInt(br.readLine());
        }
        for (i=0;i<6;i++){
            R[i]=P[i];
        }
        for(i=6,j=0;j<4;j++,i++){
            R[i]=Q[j];
        }
        for(i=0;i<10;i++){
            System.out.println(R[i]);
        }
    }
}
/*
 * Variable Description Table
 * 
 * Variable Name            Datatype            Description
 * P                        int                 to store values in first array
 * Q                        int                 to store values in the second array
 * R                        int                 to store values in the merged array
 * i                        int                 used in for loop
 * j                        int                 used in for loop
 */









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
