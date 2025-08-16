import java.io.*;
public class Stack
{
 String st[];
 int top;
 int size;
 int ctr=0;
 Stack(int capacity){
     size=capacity;
      st=new String [size];
     top=-1;
    }
    public static void main (String args[])throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter the array size");
        int s=Integer.parseInt(br.readLine());
         Stack ob=new Stack(s);
        int choice;
        do{
        System.out.println("Enter 1 to push, 2 for pop,3 for display and 4 for exit");
        choice=Integer.parseInt(br.readLine());
        switch(choice){
            case 1:
                   System.out.println("Enter element to push");
                   String e=br.readLine();
                   ob.push(e);
                   break;
            case 2:
                   String popup=ob.pop();
                      break;
            case 3:        
                   ob.display();
                   break;
            case 4:        
                   System.out.println("Exit program");
                   break;
                }
            }while(choice!=4);
            }
            void push (String element){
                if (top==size-1){
                   System.out.println("Overflow");
                }
                else{
                    top=top+1;
                    st[top]=element;
                    System.out.println("Element pushed");
                    ctr++;
                    System.out.println("The number of elements is:"+ctr); 
                }
            }
            String pop(){
                String v="";
                if (top==-1){
                    System.out.println("Underflow");
                }
                else{
                    v=st[top];
                    top=top-1;
                    ctr--;
                    System.out.println("The number of elements now is:"+ctr);
                }
                return v;
            }
            void display(){
                System.out.println("The stack is:");
                for (int i=top;i>=0;i--){
                    System.out.println (st[i]);
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
