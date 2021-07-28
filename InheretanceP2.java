/**
 * Showing inheretance part2: super class
 */
public class Bank
{
    String name;
    int accno;
    double p;
    Bank(String n,int a,double pr){
        name=n;
        accno=a;
        p=pr;
    }
    void display(){
       System.out.println("The name of the customer is:\t"+name);
       System.out.println("The account number is:\t"+accno);
       System.out.println("The principal amount:\t"+p);
    }
    
}
