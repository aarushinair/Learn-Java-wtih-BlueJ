public class Perimeter
{
   double a;
   double b;
   Perimeter(double a1,double b1){
       a=a1;
       b=b1;
    }
    double Calculate(){
       double p =2*(a+b);
        return p;
    }
    void show(){
        System.out.println("The length is:\t"+a);
        System.out.println("The breadth is:\t"+b);
        double peri=Calculate();
        System.out.println("The perimeter is:\t"+ peri);
    }  
}
.........................................................................

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
