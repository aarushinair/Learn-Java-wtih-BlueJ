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








š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
