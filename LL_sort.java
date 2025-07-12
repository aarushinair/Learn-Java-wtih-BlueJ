import java.io.*;
class LL_sort
{
   Node start, end;
   int size;
   LL_sort(){
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
  public void linearSearch(int item){
    Node ptr = start ;
    int i ;
    boolean flag = false;
    for(i = 0 ; i < size ; i ++){
        if(item == ptr.getData()){
            flag = true ;
            break ;
        }
        ptr=ptr.getLink();
    }
    if(flag == true)
        System.out.println("Element located at position : " + i) ;
    else
        System.out.println("Element does not exist") ;
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
    LL_sort l1 = new LL_sort();
    int choice=1;
    BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
     while(choice !=0){
      System.out.println("Enter element for list elements");
     int d =Integer.parseInt(br.readLine());
    l1.insert(d);
    System.out.println("To continue press 1 or else press 0");
    choice=Integer.parseInt(br.readLine());    
   }
   System.out.println("Enter element to search");
   int item =Integer.parseInt(br.readLine());
   System.out.println("The list being searched is:");
   l1.display();
   l1.linearSearch(item);
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
