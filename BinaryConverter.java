import java.io.*;
public class BinaryConverter
{//start of class
    int number;//to store input decimal number
   static long binNumber;//to store resultant binary number
    BinaryConverter(int n){//start of constructor
        number=n;
        binNumber=0;
    }
    long convert(int n){//recursive method to convert decimal to binary
        if (n==0){
            return n;
        }
        else{
            int r=n%2;
            return convert (n/2)*10+ r;//maintaining a stack and calling itself
        }
    }
    void display (){//to display the binary number
        System.out.println("The original decimal number is:\t"+ number);
        System.out.println("The resultant binary number is:"+ binNumber);
    }
    public static void main (String args[]) throws IOException{//start of main method
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a decimal number to be converted");
        int n=Integer.parseInt(br.readLine());//to store the input integer
        BinaryConverter ob= new BinaryConverter (n);//creating an object
        binNumber=ob.convert(n);//to store equivalent binary number
        ob.display();//to display the result
}// end of main method
}//end of class
/*
 * Variable Description Table
 * 
 * Variable Name            Datatype            Description
 * n                        int                 to store input value
 * number                   int                 to store the input decimal number
 * binNumber                long                to store the equivalent binary number
 * r                        int                 to store the remainder of n and 2
 */


/*
Binary Converter: To input a decimal number and print its binary equivalent through recursion.

Algorithm for BinaryConverter ():

Step 1: Start of algorithm for BinaryConverter ().
Step 2: Initialize the class variables number and binNumber to 0.
Step 3: End of algorithm of BinaryConverter ().

Algorithm for convert ():

Step 1: Start of algorithm for convert ().
Step 2: if n = 0 then return n
Step 3: else store the remainder of n and 2 in an integer variable (say r)
Step 4: return (n / 2) x 10 + r to the method itself.
Step 5: End of algorithm for convert ().

Algorithm for display ():

Step 1: Start of algorithm for display ().
Step 2: Print the original decimal number and the equivalent binary number.
Step 3: End of algorithm for display ().

Algorithm for main method ():

Step 1: Start of algorithm for main method ().
Step 2: Input a decimal number in an integer variables (n).
Step 3: Create an object and pass n to the constructer.
Step 4: Call method convert using the object created and pass variable n and store the returned value in binNumber (class variable).
Step 5: Call the method display () using the created object.
Step 6: End of algorithm of main method ().
*/







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
