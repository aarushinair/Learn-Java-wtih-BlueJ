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
