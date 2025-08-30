import java.util.Scanner;
import java.io.*;


public class class2  {
    
   public static void main(String[] args) throws IOException {

    //iwanakillmyself 
    int b=0, c=0;
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter operation and numbers respectively");
    char a = sc.next().charAt(0);
    b = Integer.parseInt(br.readLine());
    c = Integer.parseInt(br.readLine());

    switch(a)
    {
        case '+':
            System.out.println(b+c);
            break;
        case '-':
            System.out.println(b-c);
            break;
        case '*':
            System.out.println(b*c);
            break;
        case '/':
            System.out.println(b/c);
            break;
        case '%':
            System.out.println(b%c);
        default:
            System.out.println("Invalid Choice");
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
