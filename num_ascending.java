import java.io.*;
public class num_ascending {
  public static void main(String args[])throws IOException {
     int num;
       int i,j;
       int tmp;
       BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
       System.out.println("Enter a number containing three digits");
       num =Integer.parseInt(br.readLine());
       int [] arr=new int [3];  
        for (int k=0;k<3;k++){
                 arr[k]=num%10;
                 num=num/10;
                }
       for (int c=0;c<3;c++){
        for(i=0;i<3;i++){
            for (j=0;j<3-i-1;j++){
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
        System.out.println("The num in ascending order is:");
        for(i=0;i<3;i++){
            System.out.println (arr[i]);
        }
}
}
