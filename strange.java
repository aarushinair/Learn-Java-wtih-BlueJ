import java.io.*;
public class strange
{
   int ele[];
   int capacity;
   int top;
   strange (int cap){
       capacity=cap;
       ele=new int [capacity];
       top=-1;
    }
   void pushItem (int val){
       if (top==(capacity-1)){
           System.out.println("Strange is full");
        }
        else{
            top=top+1;;
            ele[top]=val;
            System.out.println("Element inserted");
        }
    }
    int popItem(){
        int v=0;
        if (top==-1){
            System.out.println("Strange is empty");
            v=-9999;
        }
        else{
            v=ele[top];
            top=top-1;
          }
        return v;
    }
    void display (){
    for (int i=0;i<=top;i++){
        System.out.println(ele[i]);
    }
    }
    public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the capacity of strange");
        int c=Integer.parseInt(br.readLine());
        if (c>20){
            System.out.println("Invalid choice");
            System.exit(0);
        }
        else{
            strange obj=new strange (c);
            int choice=0;
            do{
                System.out.println("Enter 1 to push, 2 to pop, 3 to display and 4 to exit");
              choice=Integer.parseInt(br.readLine());
                switch(choice){
                    case 1:
                          System.out.println("Enter element to be inserted");
                          int element= Integer.parseInt(br.readLine());
                          obj.pushItem(element);
                          break;
                    case 2:
                          int value=obj.popItem();
                          System.out.println("Element popped"+value);
                          break;
                    case 3:
                          obj.display();
                          break;
                    case 4:
                           System.out.println("Exit program");
                           System.exit(0);
                        }
                    }while(choice!=4);
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
