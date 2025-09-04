import java.io.*;
public class fibonacci_recursion
{
    int fibonacci (int n){
        if (n==0){
            return 0;
        }
       else if (n==1){
            return 1;
        }
       else{
           return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main (String args[]) throws IOException{
        fibonacci_recursion ob=new fibonacci_recursion();
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<=n;i++){
            System.out.print(ob.fibonacci(i));
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
