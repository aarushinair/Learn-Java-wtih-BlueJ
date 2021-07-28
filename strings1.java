import java.io.*;
public class Strings1 { 
    public static void main (String args []) throws IOException  {
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    System.out.println("Enter a word");
    String a=br.readLine();
    String m=a;
    String q=a.toUpperCase();
    int b=q.length();
    char [ ] a1=new char [b];
    int [ ] a2= new int[b];
    for(int i=0; i<b;i++){
    a1[i]=q.charAt(i);
    System.out.println(" Character  " + a1[i]);
    int y=a1[i];
    a2[i]=y;
    System.out.println(" Ascii   " + a2[i]);
   }
 }
}
