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
