import java.util.* ;
public class Stack_LL
{
    Node top , size ;
    public static void main(String[] xc){
    Scanner rk = new Scanner(System.in) ;
    int cho ,item ;
    LL_LinkedList ij = new LL_LinkedList() ;
    do{
    System.out.println(" Enter 1 to push \n 2 to pop \n 3 to display \n 4 to exit") ;
    cho = rk.nextInt() ;
    switch(cho){
    case 1: System.out.println("Enter element to insert") ;
    item = rk.nextInt() ;
    ij.insertAtStart(item) ;
    break ;
    case 2: ij.deleteAtStart() ;
    break ;
    case 3: ij.display() ;
    break ;
    }
    }
    while(cho != 4) ;
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
