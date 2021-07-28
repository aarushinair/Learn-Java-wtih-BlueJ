public class finally_program{
   public static void main (String args[]){
       int d,a;
       int []c=new int[10];
       try{
           d=0;
           a=42/d;
           c[12]=4;
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("Array Index is Out of Bounds");
        }
        catch(ArithmeticException ae){
            System.out.println("Division by zero");
        }
        finally{
            System.out.println("In finally block");
        }
        System.out.println("After try and catch");
    }
  }
