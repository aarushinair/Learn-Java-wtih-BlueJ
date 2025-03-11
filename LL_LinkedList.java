import java.util.*;
public class LL_LinkedList
{
    Node start , end ;
    int size ;
    LL_LinkedList(){
        start = null ;
        end = null ;
        size = 0 ;
    }

    public void insertAtStart(int item){
        Node nptr = new Node(item , null) ;
        size += 1 ;
        if(start == null){
            start = nptr ;
            end = nptr ;
        }
        else{
            nptr.setLink(start);
            start = nptr ;
        }
    }

    public void insertAtEnd(int item){
        Node nptr = new Node(item, null) ;
        size += 1 ;
        if(end==null){
            start = nptr ;
            end = start ;
        }
        else {
            end.setLink(nptr) ;
            end = nptr ;
        }
    }
    
     public void display(){
       Node ptr = start ;
       while(ptr!=null)
       {
           System.out.println(ptr.getData());
           ptr = ptr.getLink() ;
        }
    }
    
    public void display2(){
    Node ptr = start ;
    for(int i = 0 ; i < size ; i ++){
    System.out.println(ptr.getData()) ;
    ptr = ptr.getLink() ;
    }
    }
    
    public void deleteAtStart(){
    if(size != -1){
    start = start.getLink() ;
    size -= 1 ;
    }
    System.out.println("Empty, can not delete") ;
    }
    
    public void deleteAtEnd(){
    Node ptr = start ;
    for(int i = 1 ; i < size - 1 ; i ++)
    ptr = ptr.getLink() ;
    end = ptr ;
    end.setLink(null) ;
    size -= 1 ;
    }
    
        public void insertAtPosition(int item, int pos){
        Node nptr=new Node(item, null);
        if(start==null){
            size += 1 ;
            start = nptr ;
            end = nptr ;
        }
        else if(pos == 1)
            insertAtStart(item) ;
        else if(pos > size)
            insertAtEnd(item) ;
        else{
            Node ptr = start ;
            Node tmp = null ;
            int i = 1 ;
            while(i < pos - 1 ){
                ptr = ptr.getLink() ;
                i++ ;
            }
            tmp = ptr.getLink() ;
            ptr.setLink(nptr) ;
            nptr.setLink(tmp) ;
            size+= 1 ;
        }
    }
    
    public void deleteAtPosition(int pos){
    Node tmp ;
    Node ptr = start ;
    for(int i = 1 ; i < pos - 1 ; i ++)
    ptr = ptr.getLink() ;
    tmp = ptr.getLink() ;
    ptr.setLink(tmp.getLink()) ;
    size -= 1 ;
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
    }
    if(flag == true)
    System.out.println("Element located at: " + i) ;
    else
    System.out.println("Element does not exist") ;
    }
    
   public void reverseNode(){
   Node next , prev , curr  ;
   curr = start ;
   prev = null ;
   while(curr != null){
    next = curr.getLink() ;
    if(prev == null)
    end = prev ;
    curr.setLink(prev) ;
    prev = next ;
    curr =  end ;
    }
   }
    
   public void concat(LL_LinkedList ij , LL_LinkedList ij1){
    Node ptr = ij.start ;
     Node tmp = ptr ;
    while(ptr != null){
    tmp = ptr ;
    ptr = ptr.getLink() ;
   }
   tmp.setLink(ij1.start) ; 
    }
    
    public void split(LL_LinkedList ij , LL_LinkedList ij1 , int pos){
    Node ptr = ij.start ;
    Node tmp = ptr ;
    int i = 0 ;
    while(ptr != null && i < pos){
    tmp = ptr ;
    ptr = ptr.getLink() ;
   }
   ij1.start.setLink(tmp) ; 
    }
    
    public void sumData(){
     Node ptr = start ;
     int sum = 0 ;
       while(ptr!=null)
       {
           sum += ptr.getData() ;
           ptr = ptr.getLink() ;
        }
        System.out.println("Sum of elements is: " + sum) ;
    }
    
    public void sumOddEven(){
    Node ptr = start ;
     int even = 0 , odd = 0 ;
       while(ptr!=null)
       {
           if((ptr.getData() % 2 )== 0 )
           even += ptr.getData() ;
           else
           odd += ptr.getData() ;
           ptr = ptr.getLink() ;
        }
        System.out.println("Sum of even elements is: " + even + "\nSum of odd elements is: " + odd ) ;
    }

    public int sumRecursive(Node n) {
    if (n == null) {
        return 0;
    }
    else{
        return n.getData() + sumRecursive(n.getLink());
    }
}
    public int sumRecursive()
    {
        int x = sumRecursive(start);
        return x;
    }
    
    public static void main(String[] xc){
    Scanner rk = new Scanner(System.in) ;
    LL_LinkedList ij = new LL_LinkedList() ;
    LL_LinkedList ij1 = new LL_LinkedList() ;
    int item , pos , cho  ;
    do{
    System.out.println(" 1 to insert at start \n 2 to insert at end \n 3 to display \n 4 to delete at start \n 5 delete at end \n 6 to insert at specified position \n 7 to delete at specified position \n 8 to search an element \n 9 to reverse and print node \n 10 to print \n 11 to exit") ;
    System.out.println("12 to insert at start of 2nd list\n 13 to insert at end of 2nd list\n 14 to display of 2nd list\n 15 to delete at start of 2nd list\n 16 delete at end of 2nd list\n 17 to insert at specified position of 2nd list\n 18 to delete at specified position of 2nd list \n 19 to concat \n 20 to split") ;
    cho = rk.nextInt() ;
    switch(cho){
    case 1:System.out.println("Enter element") ;
    item = rk.nextInt() ;
    ij.insertAtStart(item) ;
    break ;
    case 2:System.out.println("Enter element") ;
    item = rk.nextInt() ;
    ij.insertAtEnd(item) ;
    break ;
    case 3: ij.display() ;
    break ;
    case 4: ij.deleteAtStart() ;
    break ;
    case 5: ij.deleteAtEnd() ;
    break ;
    case 6: System.out.println("Enter element and position") ;
    item = rk.nextInt() ;
    pos = rk.nextInt() ;
    ij.insertAtPosition(item , pos) ;
    break ;
    case 7: System.out.println("Enter position") ;
    pos = rk.nextInt() ;
    ij.deleteAtPosition(pos) ;
    break ;
    case 8: System.out.println("Enter element to find") ;
    item = rk.nextInt() ;
    ij.linearSearch(item) ;
    break ;
    case 9:ij.reverseNode() ;
    ij.display() ;
    break ;
    case 10: ij.display2() ;
    break ;
    case 12:System.out.println("Enter element") ;
    item = rk.nextInt() ;
    ij1.insertAtStart(item) ;
    break ;
    case 13:System.out.println("Enter element") ;
    item = rk.nextInt() ;
    ij1.insertAtEnd(item) ;
    break ;
    case 14: ij1.display() ;
    break ;
    case 15: ij1.deleteAtStart() ;
    break ;
    case 16: ij1.deleteAtEnd() ;
    break ;
    case 17: System.out.println("Enter element and position") ;
    item = rk.nextInt() ;
    pos = rk.nextInt() ;
    ij1.insertAtPosition(item , pos) ;
    break ;
    case 18: System.out.println("Enter position") ;
    pos = rk.nextInt() ;
    ij1.deleteAtPosition(pos) ;
    break ;
    case 19: ij.concat(ij , ij1) ;
    ij.display() ;
    break ;
    case 20: System.out.println("Enter split position") ;
    pos = rk.nextInt() ;
    ij.split(ij , ij1 , pos) ;
    break ;
    case 21 : ij.sumRecursive();
    ij.display();
    break;
    }
    }
    while(cho != 21) ;
    }
}
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
 class Node
 {
    int data;
    Node link;
    
    Node()
    {
        data=0;
        link=null;
    }
    Node(int d, Node n)
    {
        data=d;
        link=n;
    }
    int getData()
    {
        return data;
    }
    void setData(int d)
    {
        data=d;
    }
    Node getLink()
    {
        return link;
    }
    void setLink(Node n)
    {
        link=n;
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
