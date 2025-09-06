import java.io.*;
public class magic_square1{
    public static void main (String args[])throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int n;      
        System.out.println("Enter the size");
        System.out.println("Enter n as 4");
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
           for (int d=0;d<n;d++){
               for(int f=0;f<n;f++){
                    if((d+f)==2){
                        sd2=sd2+a1[d][f];
                }
            }
           }
          int sum []=new int [2*n + 2];
          for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                sum[r]=sum[r]+a1[r][c];
            }
            for (int i=1;i<n;i++){
           for(int j=0;j<n;j++){
               a1[i-1][j]=a1[i][j];
            }
        }
        }
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                sum[n + r]=sum[n + r]+a1[c][r];
            }
            for (int i=1;i<n;i++){
           for(int j=0;j<n;j++){
               a1[j][i-1]=a1[j][i];
            }
        }
      }
       sum[2*n-2]=sd1;
       sum[2*n-1]=sd2;
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











/*
👋 Hi, I’m @aarushinair — Aarushi Nair (she/her)
🎓 CS Engineer | AI Researcher | Software Engineer | DEI Professional
💡 Interests: AI/ML/DL, Responsible Tech, Innovative Technologies, Ethics in AI
🌍 Advocate for Women in Tech | Community & Events Manager @AnitaB.org India
🎙️ Speaker | Content Creator | STEM Mentor
📫 Let’s connect: https://www.linkedin.com/in/aarushinair/
📹 YouTube: Code with Aarushi → https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🐦 Twitter/X: https://x.com/aarushinair_
📁 Portfolio, projects & talks: https://github.com/aarushinair
*/
