import java.io.*;
public class Alpha{
   String str;
   int l=0;
   String ch[];
   Alpha (){
       str="";
    }
    void readWord() throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a word");
        str=br.readLine();
    }
    void arrange(){
        l=str.length();
        ch=new String [l];
        for (int i=0;i<l;i++){
            char x=str.charAt(i);
            ch[i]=Character.toString(x);
        }
        String tmp;
        for (int i=0;i<l;i++){ 
            for (int j=0;j<l-1;j++){
                int val=ch[i].compareTo(ch[j]);
                if (val<0){
                    tmp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=tmp;
                }
            }
        }
    }
    void display(){
        System.out.println("Final String is:");
        for (int i=0;i<l;i++){
            System.out.print(ch[i]);
        }
    }
     public static void main (String args[]) throws IOException{
        Alpha ob=new Alpha ();
        ob.readWord();
        ob.arrange();
        ob.display();
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
