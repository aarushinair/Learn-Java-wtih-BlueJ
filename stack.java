import java.util.*;
public class Stack//start of class
{
    String arr[];
    int n;
    int top;
    String str;
    Stack(int num) {//start of constructor
        n= num;
        arr= new String[n];//initialising array
        top=-1;
    }
    void push(String str){
        if (top<n-1) {//checking if stack is full
        top++;//incrementing top
        arr[top]=str;//insert string into stack
    }
    else {
    System.out.println("Stack overflow");//result if stack is full
    }
}
   void top() {
    if (top>-1) {
     System.out.println(arr[top]); //printing top of stack
    }
    else {
    System.out.println("Nothing");//result if stack is emtry
}
}
String pop() {
    if(top>-1) {//checking if array is empty
    String temp=arr[top];//storing top in a temp variable
    arr[top]=null;//deleting the data
    top--;//decrementing top
    return temp;//returning the top
}
else {
    System.out.println("underflow");///condition if stack is empty
    return null;//returning nothing
}
}
public static void main (String args[]) {//start of main metho
    System.out.println("Enter size of array");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();//otaining input for size of array
    Stack ob = new Stack(n);//creating an object
    
    do  {//starting a do-while loop
        System.out.println("Press 1 for push; 2 for pop and 3 for top");
        int choice = sc.nextInt();// obtaining choice from user
        switch(choice){
            case 1: System.out.println("Enter Push");
                    String s = sc.next();//taking input for value to be pushed
                    ob.push(s);//calling push()
                    break;
            case 2: String m =ob.pop();//calling pop()
                    break;
            case 3 : ob.top();//calling top()
            break;
                  
            
            
        }
        System.out.println("Do you want to continue?(y/n)");
        String s= sc.next();
        if(s.equals("n")){
         System.exit(0);
        }
        
    }
    while (true);//end of do-while loop
    
}//end of main method
}//end of class
/* Variable Description Table
 * Variable     Type        Description
 * n            int     to store the size of stack
 * arr[]        String  an String array
 * top          int     points to the topmost element in the stack
 * s            String  Stores string to be pushed
 * str          int     Stores string to be pushed,popped or viewed
 * m            String  Stroes popped string
 */
