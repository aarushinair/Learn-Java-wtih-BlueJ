import java.io.*;
public class Queue
{
    int Q[];
    int f=-1;
    int r=-1;
    int size;
    public static void main (String args[])throws IOException{
     Queue ob=new Queue();
    BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
    System.out.println("Enter array size");
    size=Integer.parseInt(br.readLine());
    Q=new int [size];
    int choice;
    System.out.println("Enter 1 to enqueue, 2 for dequeue, 3 for display, 4 for exit");
        switch(choice){
        case 1:
               System.out.println("Enter element to enqueue ");
               int e=Integer.parseInt(br.readLine());
               ob.enqueue(e);
               break;
        case 2:
               ob.dequeue();
               break;
        case 3:
               ob.display();
               break;
        case 4: 
               System.out.println("Exit Program");
               System.exit(0);
        default : System.out.println("INVALID CHOICE");
    }
}
void enqueue(int item){
    if(r==size){
        System.out.println("Queue overflows");
    }
    else if(f=-1&&r=-1){
          f=0;
          r=0;
          Q[r]=item;
          System.out.println("Element inserted");
        }
        else{
             r=r+1;
             Q[r]=item;
             System.out.println("Element is inserted");
            }
}
void dequeue(){
    int val=0;
    if (f=-1&&r=-1){
        System.out.println("Queue Underflows");
    }
    else if(f==r){
        val=Q[f];
       System.out.println("Element deleted is"+val);
        f=-1;
        r=-1;
    }
    else{
          val=Q[f];
          System.out.println("Element deleted is:"+val);
          f=f+1;
        }
    }
    
}




š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
