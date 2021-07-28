/**
 * Showing inheretance part2: sub class
 */
import java.io.*;
public class Account extends Bank
{
    double amt;
    Account(String n,int a,double pr,double amount){
        super(n,a,pr);
        amt=amount;
    }
    void deposit(){
       p=p+amt;
       System.out.println(p);
    }
    void withdraw(){
        p=p-amt;
    if(amt>=p){
        System.out.println("Insufficient Balance");
    }
    else if((p-amt)<=500){
        p=(p-(p-500))*10;
        System.out.println("The penalty is:\t"+p);
    }
       
}
void display(){
    super.display();
    System.out.println("After deposit");
    deposit();
    System.out.println("After withdraw");
    withdraw();
    }
public static void main (String args[])throws IOException{
    Account obj=new Account("Aryan",112315,4000,3600);
      obj.display();   
}
}
