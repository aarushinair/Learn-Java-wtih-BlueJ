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

