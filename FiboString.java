import java.io.*;
public class FiboString
{
   String x,y,z;
   int n;
   FiboString(){
       x="a";
       y="b";
       z="";
       n=0;
    }
    void accept() throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the number of terms");
        n=Integer.parseInt(br.readLine());
    }
    void generate(){
        System.out.print(x+" "+y+" ");
        for(int i=0;i<(n-2);i++){
            z=y+x;
            System.out.print(z+" ");
            x=y;
            y=z;
        }
    }
    public static void main (String args[])throws IOException{
       FiboString ob=new FiboString();
       ob.accept();
       ob.generate();
    }
       
}
