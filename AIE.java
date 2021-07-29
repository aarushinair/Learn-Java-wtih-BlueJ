import java.io.*;
import java.util.*;
public class AIE
{
   public static void main (String args[]) throws IOException{
       BufferedReader br=new BufferedReader (new InputStreamReader (System.in)); 
       String  s;
       System.out.println("Enter the encoded message");
       s=br.readLine();
       StringBuffer sb=new StringBuffer (s);
       sb=sb.reverse ();
       s=sb.toString();
       int l=s.length();
       char arr []=new char[l];
       String str="",h="";
       int v=0;
       for (int i=0;i<l;i++){
           char c=s.charAt(i);
           arr[i]=c;
        }
       int i=0;
        while(i<arr.length-1){
           h=Character.toString(arr[i])+Character.toString(arr[++i]);
           System.out.println(h);
           v=Integer.parseInt(h);
           if (v<65&&v!=32){
                h=h+Character.toString(arr[++i]);
               v=Integer.parseInt(h);
            }
           //if(v>65){
                str=str+(char)v;
                System.out.print(str); 
            //}
            /*else{
                if (v==32){
                    str=str+" ";
                }*/
           // }
           
            i++;
            
        }
                      
    }    
}





👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
