/*String Tokenizer (sentence): This program uses the package util and its class StringTokenizer and its methods. StringTokenizer is a class that extracts substrings from a passed string. This program is used on an input sentence.

Step1: Declare a string s

Step2: Input a sentence from the user and store it in s

Step3: Call the StringTokenizer class and pass the variable s

Step4: Start a while loop with the condition (st.hasMoreTokens () ) and repeat the steps 5 and 6

Step5: Create a String word and store in it st.nextToken ()

Step6: Print the variable word

......................................................................................................................
*/

import java.util.*;

import java.io.*;

public class token

{

    public static void main (String args[]) throws IOException{

        String s;

        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter a sentence");

        s=br.readLine();

        StringTokenizer st=new StringTokenizer (s);

        while(st.hasMoreTokens()){

            String word=st.nextToken();

            System.out.println(word);

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
