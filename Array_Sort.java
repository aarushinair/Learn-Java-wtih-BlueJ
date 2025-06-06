import java.io.*;
public class Array_Sort
{
    public static void main(String args[])throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter row size");
       int r=Integer.parseInt(br.readLine());
       System.out.println("Enter column size");
       int c=Integer.parseInt(br.readLine());
       int a1[][]=new int[r][c];
       System.out.println("Enter values for array");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               a1[i][j]=Integer.parseInt(br.readLine());
            }
        } 
        int size=r*c;
        int arr[]=new int [size];
        int pos=0;
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               arr[pos]= a1[i][j];
               pos++;
            }
        } 
       for (int i=0;i<size;i++){
           for(int j=0;j<size;j++){
           if (arr[i]<arr[j]){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }
    }
    int large = arr[size-1];
    int seclarge=arr[size-2];
           pos=0;
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               a1[i][j]=arr[pos];
               pos++;
            }
        } 
        System.out.println("The resultant array is:");
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               System.out.print(a1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Largest element:\t"+large);
                System.out.println("Second Largest element:\t"+seclarge);
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
