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








👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
