/**
 * INTERFACE
 */
public interface Printable
{
    void print ();
  
}
....................................

public class test implements Printable
{
    public void print(){
        System.out.println("Hello");
        System.out.println("Interface method called");
    }
    public static void main (String args[]){
        test obj=new test();
        obj.print();
    }
}
