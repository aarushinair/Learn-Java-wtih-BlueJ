import java.io.*;
public class throw_program
{
   public static void main(String args[]) {
       throw_program obj=new throw_program ();
       try{
           int maxNum=obj.greatest();
           System.out.println("Greatest="+maxNum);
        }
        catch(Exception e){
            System.out.println("Exception Message:"+e.getMessage());
        }
    } public int greatest()throws IOException, Exception {
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Enter first number:");
            int num1=Integer.parseInt(br.readLine());
            System.out.println("Enter second number:");
            int num2=Integer.parseInt (br.readLine());
            System.out.println("Enter third number");
            int num3=Integer.parseInt(br.readLine());
            int max=0;
            if(num1==0){
                throw new Exception("Number cannot be zero");
            }
            else{
                if((num1!=num2)&&(num2 != num3)&& (num3 != num1)){
                    max=num1;
                    if(num2>max){
                        max=num2;
                    }
                    if(num3>max){
                        max=num3;
                    }                   
                }
            }
        return max;
        }             
    }








š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
