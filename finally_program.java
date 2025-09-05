public class finally_program{
   public static void main (String args[]){
       int d,a;
       int []c=new int[10];
       try{
           d=0;
           a=42/d;
           c[12]=4;
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("Array Index is Out of Bounds");
        }
        catch(ArithmeticException ae){
            System.out.println("Division by zero");
        }
        finally{
            System.out.println("In finally block");
        }
        System.out.println("After try and catch");
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
