import java.io.*;
public class rotate
{
     public static void main(String args[])throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int l=0;
      System.out.println("Enter the array size");
      l=Integer.parseInt(br.readLine());
      int [][] arr=new int [l][l];
       System.out.println("Enter values for the array");
       for(int i=0;i<l;i++){
           for(int j=0;j<l;j++){ 
               arr[i][j]=Integer.parseInt(br.readLine());
                 }
        }
         System.out.println("The original array is:");
        for(int i=0;i<l;i++){
           for(int j=0;j<l;j++){
               System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int [] a1=new int [l*l];
        int pos=0;
        for (int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                a1[pos]=arr[i][j];
                pos++;
            }
        }
        int [] [] arr2=new int [l][l];
        int p=0;
        for (int i=0;i<l;i++){
           for(int j=0;j<l;j++){
               arr2[j][l-i-1]=a1[p];
               p++;
            }
        }
         System.out.println("The resultant array is:");
        for(int i=0;i<l;i++){
           for(int j=0;j<l;j++){
               System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
  }
}







/*
👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
*/
