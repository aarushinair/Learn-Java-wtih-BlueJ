import java.io.*;
public class Bill extends Detail
{
    int n;
    double amt;
    Bill(String nm,String a,int tel,int r,int no,double amount){
        super(nm,a,tel,r);
        n=no;
        amt=amount;
    }
    void cal(){
        if (n>=1&&n<=100){
            amt=rent;
        }
        else if (n>=101&&n<=200){
            amt=(0.6*n)+rent;
        }
        else if (n>=201&&n<=300){
            amt=(0.8*n)+rent;
        }
        else{
            amt=n+rent;
        }
    }
    void show(){
        super.show();
        cal();
        System.out.println("The Amount in Rupees is:\t"+amt);
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter Number of Calls");
        int calls=Integer.parseInt(br.readLine());
        Bill ob=new Bill ("Aarushi","Moon",7838088,3000,calls,0.0);
        ob.show();
    }
}
