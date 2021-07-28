import java.io.*;
import java.util.*;
public class CaesarCipher
{
   public static void main (String args[]) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
       String s,sf="";
       int pos=0;
       System.out.println("Enter a sentence");
       s=br.readLine();
       int len=s.length();
       String fin[]=new String [len];
       StringTokenizer st=new StringTokenizer(s);
       while(st.hasMoreTokens()){
           String word=st.nextToken();
           int l=word.length();
           for(int i=0;i<l;i++){
               char x=word.charAt(i);
               int v=(int)x;
               if(Character.isUpperCase(x)==true){
                   if(v <= 78){
                    v=v+13;
                   }
                else{
                    v=v-13;
                   }
                sf=sf+(char)v;
            }
            else{
                if(v <= 110){
                    v=v+13;
                  }
                else{
                    v=v-13;
                  }
                sf=sf+(char)v;
            }
        }
       fin [pos]=sf;
       pos++;   
       sf="";
    }
    System.out.println("Encrypted Sentence");
    for (int i=0;i<pos;i++){
        System.out.print(fin[i]+" ");
    }
}
}
