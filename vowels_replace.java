/**
 * Program to replace the vowels in a word with the next following constant
 */
import java.io.*; //importing io package
public class vowels_replace{ //starting of class
public static void main(String args[])throws IOException{//start main method
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your word ");
    String a1=br.readLine();
     String a=a1.toLowerCase();
     char []a2=new char[a.length()];//creating an array 
     String c="";
    for(int i=0;i<a1.length();i++){//Initiating a for loop
        a2[i]=a.charAt(i);
        char b=a2[i];
        if(b == 'a' || b== 'e' ||b== 'i' ||b== 'o' ||b=='u'){         
           int s=(int)(b+1);
           char z=(char)s;
           a2[i]=z;
}
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
