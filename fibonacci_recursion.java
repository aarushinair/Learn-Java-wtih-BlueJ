import java.io.*;
public class fibonacci_recursion
{
    int fibonacci (int n){
        if (n==0){
            return 0;
        }
       else if (n==1){
            return 1;
        }
       else{
           return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main (String args[]) throws IOException{
        fibonacci_recursion ob=new fibonacci_recursion();
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<=n;i++){
            System.out.print(ob.fibonacci(i));
        }

    }
}
