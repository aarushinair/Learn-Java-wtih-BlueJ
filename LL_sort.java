import java.io.*;
public class LL_sort
{
  Node start,end;
  int size,flag;
  LL_sort(){
      start=null;
      end=null;
      size=0;
    }
    void insert(int e){
        Node nptr=new Node(e,null);
        Node ptr=start;
        LinkedList ll=new LinkedList ();
        int m=0,flag=0;
        if (ptr==null){
            ll.insertAtStart(e);
            size++;
           
        }
        for (int i=0;i<=size;i++){
                    int data=ptr.getData();
            if (e<data){
            flag=0;
            m=i;
            break;
        }
        else{
            flag=1;
          }
        ptr=ptr.getLink();
     }
        if (flag==0){
            ll.insertAtPos(e,m);
        }
        else{
            ll.insertAtEnd(e);
        }
  }
  public static void main (String args[])throws IOException{
      BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
      LL_sort ob=new LL_sort();
      System.out.println("Enter element");
      int ele=Integer.parseInt(br.readLine());
      ob.insert(ele);
    }
      
    }
