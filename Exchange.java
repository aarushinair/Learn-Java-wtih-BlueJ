import java.io.*;
import java.lang.*;
public class Exchange
{
    String sent,rev,sfin;
       int size;
    
        Exchange(){
           sent="";
           rev="";
           size=0;
        }
        void readsentence()throws IOException{
            BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Enter a sentence");
            String extra=br.readLine();
            sent=extra.trim();
        }
        void exfirstlast(){
            String s=sent+" ";
            size=s.length();
            String word="";
            for (int i=0;i<size;i++){
                char ch=s.charAt(i);
                if(ch!=' ' ){
                    word=word+ch;
                }
                else{
                    int l=word.length();
                    if(l==1){
                        rev=rev+word+" ";
                    }
                    else{
                  char ch1=word.charAt(0);
                   char ch2=word.charAt(l-1);
                   if(l==2){
                       rev=rev+ch2+ch1+" ";
                    }
                    else{
                        String s1=word.substring(1,l-1);
                        rev=rev+ch2+s1+ch1+" ";
                    }
                }
                 word="";
            }
           
             sfin=rev+s.substring(i,size);
      }
   }
   void display(){
       System.out.println("The original sentence:\t"+sent);
       System.out.println("the new sentnce is:\t"+sfin);
    }
public static void main (String args[])throws IOException{
    Exchange ob=new Exchange();
    ob.readsentence();
    ob.exfirstlast();
    ob.display();
}
}
