import java.io.*;
public class magic_square1{
    public static void main (String args[])throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int n;     
        System.out.println("Enter the size");
        //System.out.println("Enter n as 4");
        n=Integer.parseInt(br.readLine());
        int a1[][]=new int [n][n];
        System.out.println("Enter the values");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a1[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("The original array is:");
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               System.out.print(a1[i][j]+"\t");
            }
            System.out.println();
        }
        int sd1=0;
        int sd2=0;
            for (int s=0;s<n;s++){
                sd1=sd1+a1[s][s];
            }
           System.out.println(sd1);
               for(int d=0,f=n-1-d;d<n;d++){
                     sd2=sd2+a1[d][f];
                            }
           System.out.println(sd2);
          int sum []=new int [2*n + 2];
          for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                sum[r]=sum[r]+a1[r][c];
            }
            System.out.println(sum[r]);
            /*for (int i=1;i<n;i++){
           for(int j=0;j<n;j++){
               a1[i-1][j]=a1[i][j];
            }
        }*/
        }
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                sum[n + r]=sum[n + r]+a1[c][r];
            }
            System.out.println("hello");
            System.out.println(sum[n+r]);
            /*for (int i=1;i<n;i++){
           for(int j=0;j<n;j++){
               a1[j][i-1]=a1[j][i];
            }
        }*/
      }
      sum[6]=sd1;
       sum[7]=sd2;
      for(int i=0;i<sum.length;i++)
      System.out.print(sum[i]+" ");


      
       int flag=1;
       int first =sum[0];
       for(int i=1;i<2*n+2;i++){
           if (first != sum[i]){
               flag=0;
               break;
            }
        }
        if (flag==1){
            System.out.println("Magic Square");
        }
        else{
            System.out.println("Not a magic square");
        }
       
    }
}






👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
