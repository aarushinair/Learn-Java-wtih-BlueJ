import java.io.*;

public class Number
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void palindrome()throws IOException
    {        
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        int i=n,d,rev=0;
        while(i>0)  
        {
            d= i;  
            rev=rev*10+d;  
            i=i/10;  
        }
        if(rev==n)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");
    }
    public static void perfect()throws IOException
    {
        System.out.println("Enter a number");
        int n=Integer.parseInt(br.readLine());
        int s=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
                s=s+i; 
        }
        if(s==n)
            System.out.println("Perfect number");
        else   
            System.out.println("Not a Perfect number");
    }
    public static void main()throws IOException
    {
        int ch;
        do
        {   
            System.out.println("Menu"); 
            System.out.println("1   Palindrome number");
            System.out.println("2   Perfect number");
            System.out.println("0   Exit");
            System.out.println("Enter your choice");
            ch=Integer.parseInt(br.readLine()); 
            switch(ch)
            {   
                case 1: palindrome();  
                            break;
                case 2: perfect();        
                            break;   
                case 0: return;
                default:System.out.println("Wrong choice. Try again.");
            }
        }
        while(ch!= 0);
    }
}






👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
