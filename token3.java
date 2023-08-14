import java.io.*;
import java.util.*;
public class token3
{
   public static void main (String args[]) throws IOException{
       BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Enter a file name");
       String file=br.readLine();
       FileReader fr=new FileReader (file);
       BufferedReader br2=new BufferedReader(fr);
       String word="";
       while((word =br2.readLine())!=null){
           StringTokenizer st=new StringTokenizer (word);
           while(st.hasMoreTokens()){
            String w2=st.nextToken();
            System.out.println(w2);
        }
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
