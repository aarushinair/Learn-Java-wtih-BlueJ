import java.util.*;
public class seriesum//start of class
{
    int x;
    int n;
    double sum;
    seriesum () {//start of constructor
        n=0;
        x=0;
        sum=0;
    }//end of contructor
    int factorial(int n) {
      
      int fact=1;
      for( int a= n ;a>0;a--) {//start of for loop
      fact*=a;//calulating factorial of n
      }
     return fact;//returning facorial
}
double term(int p,int q) {
return ((double)p/factorial(q));//returning a double
}
public void accept () {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input n");
    n= sc.nextInt();//obtaining input
    System.out.println("Input x");
    x= sc.nextInt();//obtaining input
    
}
void calsum () {
    double sum=1;
    for(int i=1; i<=n;i++) {//starting a for loop
    int p = (int)Math.pow(x,2*i-1);//raising x to the power of odd numbers
    int q = i;
    double t=term(p,q);//storing returned value in a variable
    sum=sum+t;//adding all terms
   }//ending of a for loop
   
}
void display() {
    System.out.println(sum);//displaying sum
}
    
public static void main (String args[]) {//start of main method

seriesum ob = new seriesum();//creating an object
ob.accept();//calling accept()
ob.calsum();//calling calsum()
ob.display();//calling display()
}//end of main method
}//end of class
/* Variable Description Table
 * Variable     Type        Description
 * x            int     to store the number inputted
 * n            int     to store the number terms
 * sum          double  to store the complete sum of the series
 * fact         int     to store the factorial of the number
 * a            int     used in a for loop
 * i            int     used in a for loop
 * p            int     Stores the number x to odd powers
 * q            int     stores the disarium sum of the number
 * s            double  stores the series sum
 * sum          double  stores the series sum
 * t            double  stores the value term of the series
 */
