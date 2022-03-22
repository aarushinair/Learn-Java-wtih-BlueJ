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






👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
