import java.io.*;
import java.util.*;
public class Frequency
{
    String text;
    int countand;
    int countan;
    int len;
  Frequency(){
     text="";
     countand = 0;
     countan=0;
     len=0;
    }
    void accept (String n){
        text=n;
    }
    void checkandfreq(){
        StringTokenizer st=new StringTokenizer(text);
       while (st.hasMoreTokens()){
         String word= st.nextToken();
         String x="and";
          if (word.equals(x)){
             countand++;
            }
            word="";
        }
    }
    void checkanfreq(){
        StringTokenizer st=new StringTokenizer(text);
        while (st.hasMoreTokens()){
            String word=st.nextToken();
            String x="an";
            if (word.equals(x)){
               countan++;
            }
            word="";
        }
    }
    void display(){
        System.out.println("The number of and(s) in the sentence\t"+countand);
        System.out.println("The number of an(s) in the sentence \t" +countan);
    }
    public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        Frequency obj=new Frequency ();
        System.out.println("Enter a sentence");
        String n=br.readLine();
        n=n.toLowerCase();
        obj.accept(n);
        obj.checkandfreq();
        obj.checkanfreq();
        obj.display();
    }
}
