import java.io.* ;
public class substring {
   public static void main (String args[]) throws IOException {
       BufferedReader br = new BufferedReader (new InputStreamReader (System.in)) ;
       System.out.println ("Enter a name:") ;
       String name = br.readLine() ;
       String f = name.toLowerCase() ;
       int l = f.length() ;
       for ( int x = l ; x >= 0 ; x--) {
           System.out.println (f.substring(0,x));
          
        }
     }
   }







/*
👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
*/
