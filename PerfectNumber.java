import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Perfect number program in java

public class PerfectNumberProgram {
 public static void main(String args[]) throws IOException {
 System.out.println("Enter number to check perfect number or not : ");
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 int number = Integer.parseInt(br.readLine());
 int sumOfDivisors = 0;

 for (int i = 1; i < number; i++) {
 if (number % i == 0) {
 sumOfDivisors = sumOfDivisors + i;
 }
 }
 if (number == sumOfDivisors) {
 System.out.println(number + " is a perfect number");
 } else {
 System.out.println(number + " is not a perfect number");
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
