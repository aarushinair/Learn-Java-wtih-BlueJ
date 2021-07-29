import java.io.*;
import java.util.*;
public class piglatin_duplicate
{
    public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        piglatin_duplicate ob=new piglatin_duplicate ();
        System.out.println("Enter a parah with each sentence separated by a fullstop");
        String parah=br.readLine();
        StringTokenizer st= new StringTokenizer (parah,".");
        int l=parah.length();
        String arr[]=new String [l];
        int pos=0;
        while(st.hasMoreTokens()){
            arr[pos]=st.nextToken();
            pos++;
        }
        String s_odd="";
        String s_even="";
        for (int i=0;i<pos;i++){
            if ((i%2)==0){
                s_even=s_even+arr[i];
            }
            else{
                s_odd=s_odd+arr[i];
            }
        }
        ob.piglatin (s_odd);
        ob.duplicate(s_even);
    }
    void piglatin (String s){
                StringTokenizer st3=new StringTokenizer (s);
                while (st3.hasMoreTokens()){
                String s1=st3.nextToken();
                s1=s1.toLowerCase();
       int l=s1.length();
       char ch []=new char[l];
       for(int i=0;i<l;i++){
           ch[i]=s1.charAt(i);
         if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                String res=ch[i] + s1.substring(i+1) + s1.substring(0,i) + "ay";
                System.out.println(res);
                break;
               }
      }
    }
}
    void duplicate (String s){
        String s2="", word="", word2=" ";
        StringTokenizer st2=new StringTokenizer (s);
        while(st2.hasMoreTokens()){
            word=st2.nextToken();
        int l=word.length ();
        for (int i=0;i<l-1;i++){
            char ch1=word.charAt(i);
            char ch2=word.charAt(i+1);
            if (ch1!=ch2){
               word2=word2+ch1;
            }
        }
        s2=s2+word2+" ";
        word2="";
        word="";
    }
    System.out.println("The sentence without duplicate letters is:\t"+s2);
}
}








👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
