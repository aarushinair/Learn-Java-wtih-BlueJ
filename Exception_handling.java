public class Exception_handling
{
  public static void main (String args[]){
      int a,d;
      int [] arr = new int [4];
      try{
          arr[6]=27;
          System.out.println("hi");
        }
        catch (ArrayIndexOutOfBoundsException  ai){
            System.out.println("Array Index is out of bounds");
        }
        catch(ArithmeticException ae){
            System.out.println("Didvision by zero");
        }
        catch (Exception e){
            System.out.println("After catch");
        }
            
        System.out.println("Hello");
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

