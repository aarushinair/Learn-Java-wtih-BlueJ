import java.io.*;//importing io package
public class shift
{//start of class
   public static void main (String args[])throws IOException{//start of main
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter row size");
       int r=Integer.parseInt(br.readLine());//to store input value of row size
       System.out.println("Enter column size");
       int c=Integer.parseInt(br.readLine());//to store input value of column size
       int arr[][]=new int [r][c];//creating and initializing a 2D array
       System.out.println("Enter values for the array");
       for (int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               arr[i][j]=Integer.parseInt(br.readLine());//storing the elements in the array
            }
        }
        System.out.println("The original array is:");
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               System.out.print(arr[i][j]+"\t");//displaying the original input array
            }
            System.out.println();
        }
        int [] a1=new int[c];//creating a 1D array
        for(int i=0;i<c;i++){
            a1[i]=arr[0][i];//store the first row of 2D array in the 1D array
        }
       for (int i=1;i<r;i++){
           for(int j=0;j<c;j++){
               arr[i-1][j]=arr[i][j];//shifting the array up by one row
            }
        }
        for (int i=0;i<c;i++){
            arr[r-1][i]=a1[i];//store the elements of 1D array in last row of 2D array
        }
        System.out.println("The resultant array is:");
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               System.out.print(arr[i][j]+"\t");//printing resultant 2D array
            }
            System.out.println();
        }
}//end of main method 
}//end of class











/*
👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
*/
