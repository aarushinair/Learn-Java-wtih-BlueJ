public class Area extends Perimeter
{
  double h;
  double ar;
  Area (double a1,double b1,double h1,double ar2){
      super (a1,b1);
      h=h1;
      ar=ar2;
    }
    void doarea(){
        ar=b*h;
    }
    void show(){
        super.show();
        System.out.println("The height is\t"+h);
        doarea();
        System.out.println("The area is \t"+ar);
    }
    public static void main (String args[]) {
        Area ob=new Area(24,23.5,15,0.0);
        ob.show();
    }
    }





š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
