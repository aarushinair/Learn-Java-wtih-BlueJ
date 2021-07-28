import java.io.*;
public class LL_concat
{
   Node start, end;
   int size;
   LL_concat(){
       start=null;
       end=null;
       size=0;
    }
   void insert(int d){
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
  void concat (LL_concat l1,LL_concat l2){
    Node ptr=start;
    Node tmp=ptr;
    while(ptr!=null){
        tmp=ptr;
        ptr=ptr.getLink();
    }
    tmp.setLink(l2.start);
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
    LL_concat l1 = new LL_concat();
    LL_concat l2=new LL_concat();
    int choice=1;
    BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
     while(choice !=0){
    System.out.println("Enter element for 1st list value");
     int d =Integer.parseInt(br.readLine());
    l1.insert(d);
    System.out.println("To continue press 1 or else press 0");
    choice=Integer.parseInt(br.readLine());    
   }
  choice=1;
   while(choice !=0){
    System.out.println("Enter element for 2nd list value");
     int d =Integer.parseInt(br.readLine());
    l2.insert(d);
    System.out.println("To continue press 1 or else press 0");
    choice=Integer.parseInt(br.readLine());    
  }
   l1.concat(l1,l2);
   System.out.println("The concated list is:");
   l1.display();
  }
 }
