/**
 * Program to replace the vowels in a word with the next following constant
 */
import java.io.*; //importing io package
public class vowels_replace{ //starting of class
public static void main(String args[])throws IOException{//starting of main method
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your word ");
    String a1=br.readLine();
     String a=a1.toLowerCase();
     char []a2=new char[a.length()];//creating an array 
     String c="";
    for(int i=0;i<a1.length();i++){//Initiating a for loop
        a2[i]=a.charAt(i);
        char b=a2[i];
        if(b == 'a' || b== 'e' ||b== 'i' ||b== 'o' ||b=='u'){//Initiating if loop         
           int s=(int)(b+1);
           char z=(char)s;
           a2[i]=z;
}//closing if loop
}//closing for loop
for(int y=0;y<a.length();y++){//Initiating for loop
    c=c+a2[y];
}//closing for loop

  System.out.println(c);//printing out the value
  }//end main method
}//end of class

/*  
 *  Variable Name       Datatype        Description
 *  a1                  String          to store the input String value
 *  a                   String          to store the lower case String value of a1
 *  c                   String          to store the modified String
 *  i                   int             to store the integer value of the array index
 *  b                   char            to store each character of an array
 *  s                   int             to store the integer value of a character variable
 *  z                   char            to store the character value of an integer value
 *  y                   int             to store the integer value of the array index
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
