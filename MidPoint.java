import java.io.*;
public   class MidPoint{
 double x,y;
 MidPoint(){
 x = 0 ;
 y = 0 ;
}

  void ReadPoint()throws IOException{
    BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
    System.out.println("enter values of x and y") ;
    x = Double.parseDouble(br.readLine());
    y = Double.parseDouble(br.readLine());
    
}
MidPoint midPoint( MidPoint A , MidPoint B ){
    MidPoint mp = new MidPoint() ;
    mp.x = ( A.x + B.x ) / 2 ;
    mp.y = ( A.y + B.y ) / 2 ;
    return mp ;
}

   void DisplayPoint(){
        System.out.println("Midpoint :-  " + x + y ) ;
   }
public static void main (String[] args)throws IOException{
    MidPoint A = new MidPoint() ;
    A.ReadPoint() ;
    MidPoint B = new MidPoint() ;
    B.ReadPoint() ;
    MidPoint P = A.midPoint( A,B );
     P.DisplayPoint();    
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
