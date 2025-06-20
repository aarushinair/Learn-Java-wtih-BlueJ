import java.io.*;
class date
{
public static void main(String args[]) throws IOException 
{
int dd, mm, yy;
int d1, d2, q, r, i, j, num, num1;
int[] X = new int[6];
DAtaInputStream in = new DataInputStream(System.in);
System.out.print("Enter date : ");
dd = Integer.parseInt(in.readLine());
System.out.print("Enter month : ");
mm = Integer.parseInt(in.readLine());
System.out.print("Enter year : ");
yy = Integer.parseInt(in.readLine());
if ( mm==1 || mm == 3 || mm == 5 || mm == 7 || mm == 10 || mm == 12)
{
if (dd<=31 && dd >0)
System.out.println("Valid date ");
else
System.out.println("Invalid date ");
}
else
if ( mm==4 || mm == 6 || mm == 9 || mm == 11)
{
if (dd<=30 && dd >0)
System.out.println("Valid date ");
else
System.out.println("Invalid date ");
}
else
if (mm == 2)
{
if (( yy % 100 == 0) && (yy%400 == 0) || (yy%100 == 0) && (yy%4 == 0))
if (dd>0 && dd<=29)
System.out.println("Valid date ");
else
System.out.println("Invalid date ");
else
if (dd>0 && dd<= 28)
System.out.println("Valid date ");
else
System.out.println("Invalid date ");
}
else
System.out.println("Invalid date ");
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
