import java.io.*;
public class LinkedList
{
    int size;
    Node start,end;
    LinkedList(){
        start=null;
        end=null;
        size=0;
       }
   void insertAtStart(int d){
       Node nptr=new Node (d,null);
       if (start==null){
           start=nptr;
           end=start;
           size++;
        }
        else{
            nptr.setLink(start);
            start= nptr;
            size++;
        }
    }
   void insertAtEnd(int d){
        Node nptr=new Node (d,null);
        if (end==null){
            start=nptr;
            end=nptr;
            size++;
        }
        else{
           end.setLink(nptr);
           end=nptr;
           size++;
        }
   }
   void insertAtPos(int d,int pos){
       Node nptr=new Node (d,null);
       Node ptr=start;
       for(int i=1;i<=size;i++){
           if(i==pos){
               Node tmp=ptr.getLink();
               ptr.setLink(nptr);
               nptr.setLink(tmp);
               size++;
               break;
            }
            ptr=ptr.getLink();
        }
    }
   void deleteAtStart(){
        if(start==null){
            System.out.println("No node is present to delete");
        }
        else{
        start=start.getLink();
        size--;
      }
    }
    void deleteAtEnd(){
        Node ptr=start;
        Node tmp=start;
        for (int i=1;i< size;i++){
            tmp=ptr;
            ptr=ptr.getLink();
        } 
         end=tmp;
         tmp.setLink(null);
         size--;
    }
    void deleteAtPos(int pos){
       Node ptr=start;
       for (int i=1;i<=size;i++){
           if(i==pos-1){
               Node tmp=ptr.getLink();
               Node nptr=tmp.getLink();
               ptr.setLink(nptr);
               size--;
               break;
            }
            ptr=ptr.getLink();
        }
    }
    /* int sumNodes(){
        int sum=0;
        Node ptr=start;
        for(int i=0;i<size;i++){
        sum=sum+ptr.getData();
        ptr=ptr.getLink();
      }
       return sum;
     } 
     */
   
    /*calculating sum using recursion */
    int sum(Node ptr){
        if(ptr==null){
            return 0;
        }
        else{
            int d=ptr.getData();
            return d + sum(ptr.getLink());
        }
    }
    int sumCall(){
        int sum=sum(start);
        return sum;
    }
    int countOdd(Node ptr){
        int d=0;
        if(ptr!=null){
            if(((ptr.getData())%2)!=0){
                d=1;
        }
        
        else{
            d=0;
           }
           return d +countOdd(ptr.getLink());
       }
       return d;
    }
    void OddCall(){
        int f=countOdd(start);
        System.out.println(f);
    }
    //end of calculating sum using recursion
    int count (Node ptr){
         if(ptr==null){
            return 0;
        }
        else{
            int d=1;
            return d + count(ptr.getLink());
        }
    }
    void countCall(){
        int count=count(start);
        System.out.println("The number of nodes are:\t"+count);
    }
    /* void display(){
         Node ptr=start;
         while(ptr!=null)
                   {
             System.out.println(ptr.getData());
             ptr=ptr.getLink();   
            }   
            
        } 
     */
        
    void print (Node ptr){
        if (ptr==null){
             System.out.print(" ");
        }
        else{
            System.out.println(ptr.getData());
            print(ptr.getLink());
        }
     }
     void printCall(){
         print(start);
             }
       
 public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int choice,data;
        LinkedList ll=new LinkedList ();
   do{
    System.out.println("Enter 1:insert at Start, 2:insert at end, 3:insert at position, 4:delete at start, 5:delete at end, 6:delete at positon, 7:display, 8:sum of nodes, 9:count Nodes,10:exit");
          choice=Integer.parseInt(br.readLine());
          switch(choice){
              case 1: 
                     System.out.println("Enter data to store");
                     data=Integer.parseInt(br.readLine());
                     ll.insertAtStart(data);
                     break;
              case 2:        
                     System.out.println("Enter data to store");
                     data=Integer.parseInt(br.readLine());
                     ll.insertAtEnd(data);
                     break;
              case 3:
                     System.out.println("Enter data to store");
                      data=Integer.parseInt(br.readLine());
                      System.out.println("Enter position");
                      int pos=Integer.parseInt(br.readLine());
                      ll.insertAtPos(data,pos);
                      break;
              case 4:
                     ll.deleteAtStart();
                     break;
              case 5:
                     ll.deleteAtEnd();
                     break;
              case 6:
                     System.out.println("Enter position for deletion");
                     pos=Integer.parseInt(br.readLine());
                     ll.deleteAtPos(pos);
                     break;
              case 7:
                     ll.printCall();
                     break;
              case 8:
                     int s=ll.sumCall();
                     System.out.println("The sum of nodes is:\t"+s);
                     break;
              case 9:
                     ll.OddCall();
                     break;
              case 10:
                     System.out.println("Exit Program");
                     System.exit(0);
                    }
                }while(choice !=10);
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
