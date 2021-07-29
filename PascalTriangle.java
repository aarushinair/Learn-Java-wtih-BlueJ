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








👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
