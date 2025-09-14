import java.io.*;
public class program
{
    public static void main(String args[])throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));        
        System.out.println("enter a word:");
        String name=br.readLine();       
        int l = name.length();
        char arr[]=new char[l];        
        for(int i=0;i<l;i++){          
            arr[i]=name.charAt(i);
        }        
        for(int k=0;k<l;k++){            
            for(int z=0;z<l-1;z++){               
                if(arr[z]<arr[z+1]){{
                   char temp=arr[z];
                    arr[z]=arr[z+1];                  
                    arr[z+1]=temp;
                }
            }
}
}
System.out.println("word after sorting:");
for(int m=0;m<l;m++){    
    System.out.print(arr[m]);
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
