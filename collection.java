import java.io.*;
public class Collection
{
   int arr[];
   int len;
   Collection(){
      arr=null;
      len=0;
    }
    Collection(int l){
        len=l;
        arr=new int [len];
    }
    void readArray() throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));   
        System.out.println("Enter elements for array");
        for (int i=0;i<len;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
    }
    Collection common (Collection B){
       Collection C=new Collection (len);
       int pos=0;
       for (int i=0;i<this.len;i++){
           for (int j=0;j<B.len;j++){
               if (this.arr[i]==B.arr[j]){
                   C.arr[pos]=arr[i];
                   pos++;
                }
            }
        }
        return C;
    }
    void displayArray(){
        System.out.println("The common array is ");
        for (int i=0;i<len;i++){
            if (arr[i]!=0){
            System.out.println(arr[i]);
        }
        }
    }
    public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter array size");
        int length =Integer.parseInt (br.readLine());
        Collection P=new Collection (length);
        Collection Q=new Collection (length);
        P.readArray();
        Q.readArray();
        Collection R=P.common(Q);
        R.displayArray();
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
