import java.util.*;
public class Queue_Array
{
    int Q[];
    int F;
    int R;
    int size;
    Queue_Array(int capacity){
        size=capacity;
        Q=new int[size];
        F=-1;
        R=-1;
    }
    public void enqueue(int element){
        if(R==size-1){
            System.out.println("overflow");
        }
        else if(F==-1&&R==-1){
             F=0;
             R=0;
             Q[R]=element;
             System.out.println("element inserted");

        }
        else{
             R=R+1;
             Q[R]=element;
             System.out.println("element inserted");
        }
        
        }
    int dequeue(){
        int v=0;
        if(F==-1&&R==-1){
            System.out.println("underflow");
        }
        else if(F==R){
           v=Q[F];
           System.out.println("Element deleted is"+v);
           F=-1;
           R=-1;
           }
        else{
          v=Q[F];
          System.out.println("Element deleted is:"+v);
          F=F+1;
        }
        return v;
    }
    void display(){
        for(int i=F;i<R;i++){
            System.out.println(Q[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements required in array");
        int times=sc.nextInt();
        Queue_Array obj=new Queue_Array(times);
        int choice=0;
        do{
          System.out.println("Enter 1 for push,2 for pop,3 for display,4 for exit");
          choice=sc.nextInt();
        
          switch(choice){
              case 1:
              System.out.println("Enter element:");
              int x=sc.nextInt();
              obj.enqueue(x);
            
              break;
              case 2:
              int r=obj.dequeue();
              System.out.println("the virtually removed out element is:"+r);
              break;
              case 3:
              obj.display();
              break;
              case 4:
              System.out.println("GOODBYE!!!!!!!");
              System.exit(0);
            }
        }
          while(choice!=4);
          
        
    }
}



👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
