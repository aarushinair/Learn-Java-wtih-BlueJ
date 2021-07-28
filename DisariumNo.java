import java.io.*;
import java.lang.*;
public class Disarium
{
    public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int num;
        System.out.println("Enter a number");
        num=Integer.parseInt(br.readLine());
        int n=num;
        int n1=n;
        int d=0;
        int length=0;
        int pos;
        do{
        d=n%10;
        if (d !=0){
            length ++;
        }
         n=n/10;     
    }while (n !=0);
         int [] arr=new int [length];
        pos=length;
         do{
        d=n1%10;
        if ((d >0)&&(pos!=0)){
            arr[pos-1]=d;
            pos--;
        }
         n1=n1/10;     
    }while (n1 !=0);
    double sum=0;
    for (int i=(length-1);i>=0;i--){
      sum=sum+Math.pow(arr[i],(i+1));  
    }      
    if (num==sum){
        System.out.println("The number is a disarium number");
    }
    else{
    System.out.println("Not a disarium number");
   }
}
}
