import java.io.*;
public class PalindromeCount
{
    public static void main (String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1,s2;
        System.out.println("Enter a sentence with ");
        s1=br.readLine();
        s2=s1.toLowerCase();
        String s3=s2.trim();
        char letter;
        int length=s3.length();
        String s4=" ",s;
        char arr[]=new char [length];
        char arr2[]=new char [length];
        int count=0;
        int p=0;
        int first,last;
        do{
        for(int i=0;i<length;i++){
            letter = s3.charAt(i);
            if((letter=='.')||(letter=='!')||(letter=='?')){
                s4=s3.replace(letter,' ');
            }
        }
        s=s4.trim();
        first=s.charAt(0);
        last=s.indexOf(' ');
        String sub;
        sub=s.substring(first,last);
        int l=sub.length();
        for(int i=0;i<l;i++){
            arr[i]=sub.charAt(i);
        }
        int pos=0;
        for(int i= (l-1);i>=0;i--){
            arr[pos]=sub.charAt(i);
            pos++;
        }
        for(int i=0;i<l;i++){
            if(arr[i]==arr2[i]){
                count ++;
            }
        }
        if(count==(l-1)){
            p++;
            System.out.println(sub);
        }
        count =0;
        s=s.substring((last+1),l);      
    }while(last != length);
    System.out.println("Number of palindromic words="+p);
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
