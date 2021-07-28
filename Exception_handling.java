public class Exception_handling
{
  public static void main (String args[]){
      int a,d;
      int [] arr = new int [4];
      try{
          arr[6]=27;
          System.out.println("hi");
        }
        catch (ArrayIndexOutOfBoundsException  ai){
            System.out.println("Array Index is out of bounds");
        }
        catch(ArithmeticException ae){
            System.out.println("Didvision by zero");
        }
        catch (Exception e){
            System.out.println("After catch");
        }
            
        System.out.println("Hello");
    }     
}
