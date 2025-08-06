import java.util.* ;
public class R_Pallindrome
{
 int findPallindrome(int num){
     int n = 0 ;
 if(n > 0){
  n += num % 10 ;
  n *= 10 ;
   return findPallindrome(num / 10) ;
}
return n ;
 }
 
 public static void main(String[] xc){
     Scanner rk = new Scanner(System.in) ;
     System.out.println("Enter number") ;
     int num = rk.nextInt() ;
     R_Pallindrome obj = new R_Pallindrome() ;
  int num1 = obj.findPallindrome(num) ;
  if(num1 == num)
  System.out.println("Pallindrome number") ;
  else
  System.out.println("Not pallindrome") ;
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

