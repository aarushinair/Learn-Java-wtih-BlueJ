//Write a Java Program to Input a sentence and print those words which begin with a vowel

import java.io.*;
class Vowel_Word
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.print("Enter any sentence: ");
String s=br.readLine();

s = s+" ";
int l=s.length();
int pos=0;
char ch1, ch2;
String w;

for(int i=0; i&amp;lt;l; i++)
{
ch1 = s.charAt(i);
if(ch1 == ‘ ‘)
{
w = s.substring(pos,i); // extracting words one by one
ch2 = w.charAt(0);
if(ch2==’A’ || ch2==’E’ || ch2==’I’ || ch2==’O’ || ch2==’U’ ||
ch2==’a’ || ch2==’e’ || ch2==’i’ || ch2==’o’ || ch2==’u’)
{
System.out.println(w);
}
pos = i+1;
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
