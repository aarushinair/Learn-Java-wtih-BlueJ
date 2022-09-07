import java.util.*;
public class Rot90//start of class
{
     int temp;
   public static void main (String args[]) {// start of main method
       Scanner sc = new Scanner(System.in);
       System.out.println("please enter size");
       int s = sc.nextInt();//obtaining input for size of array
       int arr[][]= new int[s][s];//initialising the array
       System.out.println("please enter data");
for(int i=0;i<s;i++) {//starting a for loop
for(int j=0;j<s;j++) {//starting a nested for loop
    arr[i][j] = sc.nextInt();//inputting data to an arra
    }//ending a nested for loop
}//ending a for loop

for(int i=0;i<s;i++) {//starting a for loop
for(int j=0;j<s;j++) {//starting a nested for loop
System.out.print(arr[i][j]+"\t");//printing a column of array
}//ending a nested for loop
System.out.println();//breaking a line
}
for(int i=0;i<s;i++) {//starting a for loop
for(int j=0;j<s;j++) {//starting a nested for loop
    int temp= arr[i][j];//swapping
    arr[i][j]=arr[j][i];
    arr[j][i]= temp;
}//ending a nested for loop
System.out.println("Rotated Matrix");
for(i=0;i<s;i++) {//starting a  nested for loop
for(int  j=0;j<s;j++) {//starting a nested for loop
System.out.print(arr[i][j]+"\t");//printing a column of array
}//ending a nested for loop
System.out.println();//breaking a line
}//ending a nested for loop
}//ending a for loop
}//end of main method
}//end of class
/* Variable Description Table
 * Variable     Type        Description
 * s            int     to store the size of 2d array
 * arr[][]      int     an integer array
 * i            int     used in for loop
 * j            int     used in for loop
 * temp         int     temporary variable used swapping
 */




👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
