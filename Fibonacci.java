import java.io.*;
public class Fibonacci
{//start of class
   String x,y,z;
   int n;
   Fibonacci(){//start of constructor
       x="a";
       y="b";
       z="";
       n=0;
    }//end of constructor
    void accept() throws IOException{//to input number of terms
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter the number of terms");
        n=Integer.parseInt(br.readLine());
    }
    void generate(){//to print the fibonacci series
        System.out.print(x+" "+y+" ");//print the first values of x and y
        for(int i=0;i<(n-2);i++){
            z=y+x;//concat the values
            System.out.print(z+" ");//print the concated value
            x=y;//swap the values
            y=z;//swap the values
        }
    }
    public static void main (String args[])throws IOException{//start of main method
       Fibonacci ob=new Fibonacci();//create an object
       ob.accept();//call method accept()
       ob.generate();//call method generate()
    }//end of main method
       
}//end of class
/*
 * Variable Description Table
 * 
 *Variable Name            Datatype            Description
 * x                       String              to store first string in the fibonacci series
 * y                       String              to store second string in the fibonacci series 
 * z                       String              to store concatenated x and y values
 * n                       int                 to store number of terms
 */









/*
👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
*/