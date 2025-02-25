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









/*
👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
*/
