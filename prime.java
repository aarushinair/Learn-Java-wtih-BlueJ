import java.io.*;
public class Prime
{
   int r;
   int c;
   int arr[][];
   Prime()throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the array row size <20");
       r=Integer.parseInt(br.readLine());
       System.out.println("Enter the array column size <20");
       c=Integer.parseInt(br.readLine());
       arr=new int[r][c];
    }
    int isPrime(int p){
        int res;
        if ((p==2)||(p/2!=0){
            res=1;
    }
    else{
        res=0;
    }
    return res;
}

 }
