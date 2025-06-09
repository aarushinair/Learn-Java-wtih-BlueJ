/* 
Experiment No.7
Program to check order of execution in inheritance
*/
class Base { 
  Base() { 
    System.out.println("Base Class Constructor Called "); 
  } 
} 
  
class Derived extends Base { 
  Derived() { 
    System.out.println("Derived Class Constructor Called "); 
  } 
} 
  
public class Main { 
  public static void main(String[] args) {   
    Derived d = new Derived();
  } 
} 


/*
OUTPUT:
Base Class Constructor Called 
Derived Class Constructor Called 
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
