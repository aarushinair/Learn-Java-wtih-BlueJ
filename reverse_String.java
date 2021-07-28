import java.io.*;
public class reverse_String
{
   String reverse(String s,int l){
     if(l==1){
         return s;
        }
        else{
            int i=l-1;
            char x=' ';
            if(i<l){
                x=s.charAt(i);
                s=s.substring(0,l-1);
                
            }
                return x+reverse(s,l-1);
            
         }
        }
        public static void main(String args[]) throws IOException{
            reverse_String obj=new reverse_String();
            BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
            System.out.println("Enter a sentence");
            String s=br.readLine();
            int len=s.length();
            String sres=obj.reverse(s,len);
            System.out.println("The reversed sentence is\t"+sres);
        }
}
