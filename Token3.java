/*String Tokenizer (file): This program uses the package util and its class StringTokenizer and its methods. StringTokenizer is a class that extracts substrings from a passed string. This program is used on an input file name.

Step1: Declare a string file

Step2: Input a file name from the user and store it in file.

Step3: Call the class FileReader and pass variable file.

Step4: Call class BufferedReader (whose object is br2) and pass the object of class FileReader

Step5: Declare a String variable word

Step6: Start a while loop with the condition ((word= br2.readLine())! = null) and repeat the steps

Step7: Call the class StringTokenizer and pass the variable word.

Step8: Start a while loop with the condition (st.hasMoreTokens ()) and repeat the steps 9 and 10

Step9: Create a String w2 and store in it st.nextToken ()

Step10: Print the variable w2

.....................................................................................................................
*/

import java.io.*;

import java.util.*;

public class token3

{

   public static void main (String args[]) throws IOException{

       BufferedReader br=new BufferedReader (new InputStreamReader (System.in));

       System.out.println("Enter a file name");

       String file=br.readLine();

       FileReader fr=new FileReader (file);

       BufferedReader br2=new BufferedReader(fr);

       String word="";

       while((word =br2.readLine())!=null){

           StringTokenizer st=new StringTokenizer (word);

           while(st.hasMoreTokens()){

            String w2=st.nextToken();

            System.out.println(w2);

        }

    }

}

       

}
