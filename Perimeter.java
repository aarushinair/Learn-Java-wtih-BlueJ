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








👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
