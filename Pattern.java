/*
Experiment No.9
Program to print a given pattern
*/
public class Pattern 
{ 
        int i, j; 
     public static void main(String args[]) 
    { 
        int n = 5; 
        
        for(i=0; i<n; i++) 
        {     
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
            System.out.println();
        } 
  } 
}
/*
OUTPUT:

* 
* * 
* * * 
* * * * 
* * * * *
|
*/
