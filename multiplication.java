import java.io.*;
public class multiplication
{
    public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int a,b,c,d;
        System.out.println("Enter the row and column of first matrix");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        System.out.println("Enter the row and column of second matrix");
        c=Integer.parseInt(br.readLine());
        d=Integer.parseInt(br.readLine());
        if (b!=c){
            System.out.println("Invalid multiplication");
            System.exit(0);
        }
        else{
            int a1[][]=new int [a][b];
            int a2[][]=new int [c][d];
            int a3[][]=new int [a][d];
            System.out.println("Enter elements for first matrix");
            for (int i=0;i<a;i++){
                for (int j=0;j<b;j++){
                    a1[i][j]=Integer.parseInt(br.readLine());
                }
            }
            System.out.println("Enter elements for second matrix");
            for (int i=0;i<c;i++){
                for (int j=0;j<d;j++){
                    a2[i][j]=Integer.parseInt(br.readLine());
                }
            }
             for (int i=0;i<a;i++){
                 for (int k=0;k<d;k++){
                        for(int j=0;j<b;j++){
                    a3[i][k]=a3[i][k]+a1[i][j]*a2[j][k];
                }
            }
          }
        System.out.println("Resultant matrix");
        for (int i=0;i<a;i++){
            for (int j=0;j<d;j++){
                System.out.print(a3[i][j]+"\t");
            }
            System.out.println();
        }
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