import java.io.*;
public class dequeue
{
    Node start,end;
    int size;
    dequeue(){
       start=null;
       end=null;
        size=0;
    }
    void insertAtFront(int d){
        Node nptr=new Node (d,null);
        if (start==null){
            start=nptr;
            end=nptr;
            size++;
        }
        else{
            nptr.setLink(start);
            start=nptr;
            size++;
        }
    }
    void insertAtRear(int d){
        Node nptr=new Node (d,null);
        if (start==null){
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
    void deleteAtFront(){
        if(start==null){
            System.out.println("No nodes to be deleted");
        }
        else{
           start=start.getLink();
           size--;
        }
    }
    void deleteAtRear(){
        if (start==null){
            System.out.println("No nodes to be deleted");
        }
       else{
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
      }
      void display(){
      Node ptr=start;             
       while(ptr!=null)
       {
             System.out.println(ptr.getData());
             ptr=ptr.getLink();   
            }   
  }
      public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        dequeue q=new dequeue ();
        int choice=0;
        do{
            System.out.println("1.To insert at START");            
            System.out.println("2.To insert at END");
            System.out.println("3.To delete at START");
            System.out.println("4.To delete at END");            
            System.out.println("5.To DISPLAY");            
            System.out.println("6.EXIT");            
            choice=Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                      System.out.println("To insert value of element");
                      int ele=Integer.parseInt(br.readLine());
                      q.insertAtFront(ele);
                      break;
                case 2:
                      System.out.println("To insert value of element");
                      ele=Integer.parseInt(br.readLine());
                      q.insertAtRear(ele);
                      break;
                case 3:
                      q.deleteAtFront();
                      break;
                case 4:
                      q.deleteAtRear();
                      break;
                case 5:
                      q.display();
                      break;
                case 6:
                      System.out.println("Exit program");
                      System.exit(0);
                    }
                }while(choice!=6);
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
