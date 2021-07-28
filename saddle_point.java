import java.io.*;
public class saddle_point
{ 
    public static void main (String args[])throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the array size");
        int size=Integer.parseInt(br.readLine());
        int A [][]=new int [size][size];
        System.out.println("Enter the values");
        for(int i=0;i<size;i++){
           for(int j=0;j<size;j++){
               A[i][j]=Integer.parseInt(br.readLine());
            }
        }
        int min=0 , max=0 , x=0;
        int flag=0;
        for(int i=0;i<size;i++){
            min=A[i][0];
            x=0;
            for(int j=0;j<size;j++){
             if(A[i][j]<min){
                    min=A[i][j];
                    x=j;
                }
            }
       
            max=A[0][x];
            for(int k=0;k<size;k++){
               if(A[k][x]>max){
                   max=A[k][x];
                }
            }    
            if(max==min){
                flag=1;
                 System.out.println("The saddle point is"+max);
                 break;
            }
        }
     
            if(flag==0){
                System.out.println("NO SADDLE POINT");
            }
        }
    }
