import java.io.*;
public class b_search
{
  public static void main (String args[])throws IOException{
      int flag=0;
      int pos=0;
      int n;
      BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
      System.out.println("Enter array length");
      int l=Integer.parseInt(br.readLine());
      int arr[]=new int[l];
      System.out.println("Enter the array elements");
      for(int i=0;i<l;i++){
          arr[i]=Integer.parseInt(br.readLine());
        }
      System.out.println("Enter the element to be found");
      n=Integer.parseInt(br.readLine());
       int first = 0, last=l-1;
        while (first <= last)                              
        {
            int mid = (first + last) / 2;                  
            if (n== arr[mid]){                        
                pos=mid;                                    
                flag=1;
                break;
            }
            if (n > arr[mid]){
                first = mid + 1;
            }
            else{
                last = mid - 1;
        }
    }
 if (flag==1){
     System.out.println("Element found at position:\t"+(pos+1));
    }
    else{
        System.out.println("Element not found");
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
