import java.util.Scanner;
import java.io.*;


public class class2  {
    
   public static void main(String[] args) throws IOException {

    //iwanakillmyself 
    int b=0, c=0;
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter operation and numbers respectively");
    char a = sc.next().charAt(0);
    b = Integer.parseInt(br.readLine());
    c = Integer.parseInt(br.readLine());

    switch(a)
    {
        case '+':
            System.out.println(b+c);
            break;
        case '-':
            System.out.println(b-c);
            break;
        case '*':
            System.out.println(b*c);
            break;
        case '/':
            System.out.println(b/c);
            break;
        case '%':
            System.out.println(b%c);
        default:
            System.out.println("Invalid Choice");
    }
    
            
           

    }
    
    
    
    }
