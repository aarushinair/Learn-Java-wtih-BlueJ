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




👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
