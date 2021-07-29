import java.util.*;
public class SaddlePoint//start of class
{
    public static void main (String args[]) {//start of main method
        System.out.println("Enter the size ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();//obtaining input from user
        int arr[][] = new int[size][size];//initialising 2-D array
        System.out.println("Enter the data");
        for(int i=0;i<size;i++) {//starting a for loop
            for (int j=0;j<size;j++) {//starting a nested for loop
                 arr[i][j] = sc.nextInt();//obtaining input for filling the array
            }//ending the nested for loop
        }//ending the for loop
        int min,max,x;
        int flag=0;
        for(int i =0; i<size;i++) {//starting a for loop
         min = arr[i][0];
         x=0;
        for(int j=0;j<size;j++) {//starting a nested for loop
            if(arr[i][j]<min){//finding smallest value in row
                min = arr[i][j];
                x=j;
            }
        }//ending the nested for loop
        max=arr[0][x];
        for(int k=0;k<size;k++) {//starting a nested for loop
           if(arr[k][x]>max){//finding greatest value in column
            max=arr[k][x];
        }
    }//ending nested for loop
    if (max==min) {//result when we have a saddlepoint
        flag = 1;
        System.out.println("Saddle is "+max);
    }
    if(flag==0)  {//result when saddlepoint is not there
      System.out.println("no point");
    }
}
}//end of main method
}//end of class
/* Variable Description Table
 * Variable     Type        Description
 * size         int     to store the size of the array
 * arr[][]      int     an array to store integers
 * i            int     used in for loop
 * j            int     used in for loop
 * min          int     findsthe row number of the smallest value
 * max          int     finds the column with the greaatest value
 * x            int     points to the row with smallest value
 * flag         int     confirms if there is a saddlepoint
 * k            int     used in for loop
 */








👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
