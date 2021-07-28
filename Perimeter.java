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
