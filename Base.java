/* 
Experiment No.7
Program to check order of execution in inheritance
*/
class Base { 
  Base() { 
    System.out.println("Base Class Constructor Called "); 
  } 
} 
  
class Derived extends Base { 
  Derived() { 
    System.out.println("Derived Class Constructor Called "); 
  } 
} 
  
public class Main { 
  public static void main(String[] args) {   
    Derived d = new Derived();
  } 
} 


/*
OUTPUT:
Base Class Constructor Called 
Derived Class Constructor Called 
*/
