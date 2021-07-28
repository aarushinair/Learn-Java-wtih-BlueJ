import java.util.*;
public class acceptscanner
{
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 5 names");
        String arr[]=new String [5];
        for(int i=0;i< 5;i++){
            if (sc.hasNext ()){
                arr[i]= sc.next();
            }
        }
        System.out.println("The names are:");
        for(int c=0;c<5;c++){
            System.out.println(arr[c]);
        }    
    }
}
