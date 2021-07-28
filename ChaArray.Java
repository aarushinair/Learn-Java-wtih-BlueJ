import java.io.*;
public class ChaArray
  {
   char ch[];
   int size;
   String fin;
    ChaArray(char c[]){
        size=10;
        ch=new char[size];
        for (int i=0;i<10;i++){
            ch[i]=c[i];
        }
    }
    void move(){
        String up="";
        String low="";
        for (int i=0;i<10;i++){
            if (Character.isUpperCase(ch[i])==true){
                up=up+ch[i];
            }
            else{
                low=low+ch[i];
            }
        }
        fin=low+up;      
    }
    void displayArray(){
        System.out.println("The original sequence:");
        for (int i=0;i<10;i++){
            System.out.print(ch[i]+" ");
        }
        System.out.println("The new sequence is:"+fin);
       }
       public static void main (String args[])throws IOException{
         BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
         System.out.println("Enter 10 letter sequence");
         String st=br.readLine();
         char s[]=new char [10];
         for (int i=0;i<10;i++){
             s[i]=st.charAt(i);
            }
         
   ChaArray ob=new ChaArray(s);
   ob.move();
   ob.displayArray();
}
}
