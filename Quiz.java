import java.io.*;
import java.lang.*;
public class Quiz {
public static void main (String args[]) throws IOException{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int n=0,pos=0,sc=0;
System.out.println("Enter number of participants");
n=Integer.parseInt(br.readLine());
if (n<3 || n>11){
   System.out.println("Invalid number of participants");
   System.exit(0);
}
else{
  char arr [][]=new char [n][5];
  for (int i=0;i<n;i++){
   System.out.println ("Enter answers of participant "+(i+1));
   String s=br.readLine();
   for (int k=0;k<s.length();k++){
       char c= s.charAt(k);
       if (c!=' ' ){
           arr[i][pos]=c;
           pos++;
        }
      }
      pos=0;
  }
char a1[]= new char [5];
System.out.println("Enter the key values");
String s = br.readLine();
pos=0;
for (int k=0;k<s.length();k++){
   char c= s.charAt(k);
     if (c!=' ' ){
           a1[pos]=c;
           pos++;
             }
            }
char row []=new char [5];
int scores[]=new int[n];
for (int i=0;i<n;i++){
  for(int j=0;j<5;j++){
  row[j]=arr[i][j];
   }
  for(int k=0;k<5;k++){
    if (a1[k]==row[k]){
      sc++;
     }
   scores[i]=sc;
  }
   sc=0;
 }
for(int i=0;i<n-1;i++){
   if(scores[i]>scores[i+1]){
      int tmp=scores[i];
      scores[i]=scores[i+1];
      scores[i+1]=tmp;
   }
  }
System.out.println("Scores:");
for (int i=0;i<n;i++){
   System.out.println("Participant "+(i+1)+" = "+scores[i]);
  }
System.out.println("highest score :");
int max=scores[0];
for (int i=0;i<n;i++){
    if(max < scores[i]){
        max=scores[i];
    }
}
for (int i=0;i<n;i++){
    if (max==scores[i]){
        System.out.println("Participant "+(i+1));
    }
}
}
}
}








/*
👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
*/
