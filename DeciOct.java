import java.util.* ;
public class DeciOct
{
    int n , oct ;
    DeciOct(){
    n = 0 ;
    oct = 0 ;
    }
    void getoct(int nn){
    n = nn ;
    }
    void deci_oct(){
    if(n > 7){
    oct += (n / 8) ;
    n /= 8 ;
    oct *= 10 ;
    deci_oct() ;
    }
    else{
    oct += n ;
    }
    }
    void show(){
    System.out.println("Answer is:" + oct) ;
    }
    public static void main(String[] xc){
    Scanner rk = new Scanner(System.in) ;
    System.out.println("Enter number") ;
    int n = rk.nextInt() ;
    DeciOct rr = new DeciOct() ;
    rr.getoct(n) ;
    rr.deci_oct() ;
    rr.show() ;
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
