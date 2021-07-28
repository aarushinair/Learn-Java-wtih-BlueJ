import java.util.* ;
public class Stack_LL
{
    Node top , size ;
    public static void main(String[] xc){
    Scanner rk = new Scanner(System.in) ;
    int cho ,item ;
    LL_LinkedList ij = new LL_LinkedList() ;
    do{
    System.out.println(" Enter 1 to push \n 2 to pop \n 3 to display \n 4 to exit") ;
    cho = rk.nextInt() ;
    switch(cho){
    case 1: System.out.println("Enter element to insert") ;
    item = rk.nextInt() ;
    ij.insertAtStart(item) ;
    break ;
    case 2: ij.deleteAtStart() ;
    break ;
    case 3: ij.display() ;
    break ;
    }
    }
    while(cho != 4) ;
    }
}
