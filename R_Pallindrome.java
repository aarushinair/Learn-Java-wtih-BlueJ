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








👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
