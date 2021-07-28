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
