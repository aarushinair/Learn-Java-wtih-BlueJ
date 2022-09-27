import java.io.*;
public class Stack_Array
{
 int stack[];
 int top;
 int size;
 Stack_Array(int capacity){
     size=capacity;
     stack=new int [size];
     top=-1;
    }
    public static void main (String args[])throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter the array size");
        int s=Integer.parseInt(br.readLine());
        Stack_Array ob=new Stack_Array(s);
        int choice;
        do{
        System.out.println("Enter 1 to push, 2 for pop,3 for display and 4 for exit");
        choice=Integer.parseInt(br.readLine());
        switch(choice){
            case 1:
                   System.out.println("Enter element to push");
                   int e=Integer.parseInt(br.readLine());
                   ob.push(e);
                   break;
            case 2:
                   int popup=ob.pop();
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
            public void push (int element){
                if (top==size-1){
                   System.out.println("Overflow");
                }
                else{
                    top=top+1;
                    stack[top]=element;
                    System.out.println("Element pushed");
                }
            }
            int pop(){
                int v=0;
                if (top==-1){
                    System.out.println("Underflow");
                }
                else{
                    v=stack[top];
                    top=top-1;
                }
                return v;
            }
            void display(){
                System.out.println("The stack is:");
                for (int i=top;i>=0;i--){
                    System.out.println (stack[i]);
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
