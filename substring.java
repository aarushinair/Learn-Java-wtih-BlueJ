import java.io.* ;
public class substring {
   public static void main (String args[]) throws IOException {
       BufferedReader br = new BufferedReader (new InputStreamReader (System.in)) ;
       System.out.println ("Enter a name:") ;
       String name = br.readLine() ;
       String f = name.toLowerCase() ;
       int l = f.length() ;
       for ( int x = l ; x >= 0 ; x--) {
           System.out.println (f.substring(0,x));
          
        }
     }
   }
