import java.util.* ;
public class Queue_LL
{
    Node top , size ;
    public static void main(String[] xc){
    Scanner rk = new Scanner(System.in) ;
    int cho ,item ;
    LL_LinkedList ij = new LL_LinkedList() ;
    do{
    System.out.println(" Enter 1 to queue \n 2 to dequeue \n 3 to display \n 4 to exit") ;
    cho = rk.nextInt() ;
    switch(cho){
    case 1: System.out.println("Enter element to insert") ;
    item = rk.nextInt() ;
    ij.insertAtEnd(item) ;
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






š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
