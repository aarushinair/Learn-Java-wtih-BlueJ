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








👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
