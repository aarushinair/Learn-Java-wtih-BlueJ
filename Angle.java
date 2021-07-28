import java.io.*;
public class Angle
{
        int deg;
        int min;
        Angle(){
            deg=0;            
            min=0;
        }
        void inputAngle() throws IOException{
            BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
            System.out.println("Enter the angle's value for degrees");
            deg=Integer.parseInt(br.readLine());
            System.out.println("Enter the angle's value for minutes");
            min=Integer.parseInt(br.readLine());
        }
       Angle sumAngle(Angle A,Angle B){
            Angle C=new Angle();
            int sum1=(A.deg+B.deg);
            int sum2=(A.min+B.min);
            if(sum2 >= 60){
                 sum2=sum2-60;
                 sum1=sum1+1;
                }
                C.deg=sum1;
                C.min=sum2;
                return C;
         }
          void dispAngle(){
              System.out.println("The sum of the angles is\t"+deg+"degrees and \t"+min+"minutes");            
        }
        public static void main (String args[])throws IOException{
         Angle A=new Angle();
         Angle B=new Angle();
         Angle C=new Angle();
         A.inputAngle();
         B.inputAngle();
         C=A.sumAngle(A,B);
         C.dispAngle();
        }
     }
