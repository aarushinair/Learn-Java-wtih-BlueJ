/**
 * Write a description of class Pascal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class PascalTriangle {
public static void main(String[] args) {
try {
BufferedReader br = new BufferedReader(new InputStreamReader(
System.in));
System.out.print("Enter rows for pascal triangle:");
 
int n = Integer.parseInt(br.readLine());
 
for (int i = 0; i < n; i++) {
int number = 1;
for (int j = 0; j < n - i; j++) {
System.out.print("   ");
}
for (int k = 0; k <= i; k++) {
System.out.print("   ");
System.out.print(number);
System.out.print("  ");
number = number * (i - k) / (k + 1);
}
System.out.println();
 
}
 
} catch (Exception e) {
System.out.println(e);
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
