import java.io.*;
public class LL_split
{
    Node start, end;
    int size;
    LL_split(){
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
    void split(int pos, LL_split l1, LL_split l2){
        Node ptr=l1.start;
        Node tmp=ptr;
        for (int i=1;i<=pos;i++){
            tmp=ptr;
            ptr=ptr.getLink();
        }
        tmp.setLink(null);
        l2.start=ptr;
    }
    void countNodes(){
        Node ptr=start;
        int ctr=0;
        while(ptr!=null){
            ctr++;
            ptr=ptr.getLink();
        }
        System.out.println("No of nodes are:\t"+ctr);      
       }
    void display(){
        Node ptr=start;
        while(ptr!=null){
            System.out.println(ptr.getData());
            ptr=ptr.getLink();
        }
    }
    public static void main (String args[]) throws IOException{
      BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
      LL_split l1=new LL_split();
      LL_split l2=new LL_split();
      int choice=1;
       while(choice !=0){
    System.out.println("Enter element for list");
     int d =Integer.parseInt(br.readLine());
    l1.insert(d);
    System.out.println("To continue press 1 or else press 0");
    choice=Integer.parseInt(br.readLine());    
   }
   System.out.println("Enter position to split");
   int p=Integer.parseInt(br.readLine());
     System.out.println("Original List");
     l1.display();
     l1.countNodes();
     l1.split(p,l1,l2);   
     System.out.println("The two different lists are:");
     System.out.println("1st list:");
     l1.display();
     System.out.println("2nd list");
     l2.display();
    }
}









/*
👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
*/
