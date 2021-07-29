/*
A Palindrome is a word that may be read the same way in either direction.
Accept a sentence in UPPER CASE which is terminated by either ” . “, ” ? ” or ” ! “.
Each word of the sentence is separated by a single blank space.
Perform the following tasks:

(a) Display the count of palindromic words in the sentence.
(b) Display the Palindromic words in the sentence.
Example of palindromic words: MADAM, ARORA, NOON
Test your program with the sample data and some random data:

Example 1
INPUT : MOM AND DAD ARE COMING AT NOON.
OUTPUT : MOM DAD NOON
NUMBER OF PALINDROMIC WORDS : 3
*/

import java.io.*;
import java.util.*;
class Palin_ISC2013
{
static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
 
boolean isPalin(String s)
{
int l=s.length();
String rev="";
for(int i=l-1; i>=0; i--)
{
rev=rev+s.charAt(i);
}
if(rev.equals(s))
return true;
else
return
false;
}
 
public static void main(String args[])throws IOException
    {
        Palin_ISC2013 ob=new Palin_ISC2013();
        System.out.print("Enter any sentence : ");
        String s=br.readLine();
        s=s.toUpperCase();
 
        StringTokenizer str = new StringTokenizer(s,".?! ");
        int w=str.countTokens(); 
 
        String word[]=new String[w];
        for(int i=0;i<w;i++)
        {
            word[i]=str.nextToken();
        }
 
        int count=0;
        System.out.print("OUTPUT : ");
        for(int i=0; i<w; i++)
        {
            if(ob.isPalin(word[i])==true)
            {
                count++;
                System.out.print(word[i]+" ");
            }
        }
 
        if(count==0)
        System.out.println("No Palindrome Words");
        else
        System.out.println("nNumber of Palindromic Words : "+count);
    }
} 

/*
Algorithm for main() method : 
Step 1   :               Start of algotithm
Step 2   :               Input the sentence and store it in a String variable ‘s’
Step 3   :               Convert the sentence into upper case
Step 4   :               Create a StringTokenizer object ‘str’ to extract tokens (words) from the sentence using space and other the punctuation marks namely ‘.’, ‘?’, ‘!’
Step 5   :               Count the number of tokens (words) and store it in an integer variable ‘c’. Also create a String array word[ ] of size ‘c’
Step 6   :               Start a for loop from i = 0 to less than ‘c’ and store the tokens of the sentence into the word [ ] array
Step 7   :               Declare an integer variable ‘count’ and initialize it with 0
Step 8   :               Start a for loop from i = 0 to less than ‘c’ and repeat step 9
Step 9   :               Call the function isPalin() as : ob.isPalin(word[i]). If the returned value is ‘true’ then increase the count variable and print the word.
Step 10 :               If count of palindromic words is not equal to zero, then print the value stored in the variable ‘count’
Step 11 :               End of algorithm for main() method

Algorithm for function boolean isPalin(String s) :
Step 1   :               Start of algorithm for function isPalin()
Step 2   :               Find the length of the String ‘s and store it in an integer variable ‘l’
Step 3   :               Declare and initialize a String variable rev=”” for storing the reverse of the String ‘s’
Step 4   :               Start a reverse for loop from i = l-1 to 0 and repeat step 5
Step 5   :               Extract characters from the end of the original string and add them to the variable ‘rev’
Step 6   :               If the reverse word obtained (rev) is equal to the original String (s), then return true, otherwise return false.
Step 7   :               End of algorithm for the function isPalin().
*/










👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
