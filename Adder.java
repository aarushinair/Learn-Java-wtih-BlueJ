import java.util.* ;
class Adder {
    int[] a;
    Adder() {
        a = new int[2];
    }

    void readtime(){
        Scanner rk = new Scanner(System.in) ;
        System.out.println("Enter hour : ");
        this.a[0] = rk.nextInt();
        System.out.println("Enter minute : ");
        this.a[1] = rk.nextInt();
    }

    void addtime(Adder X, Adder Y) {
        int hour1 = X.a[0];
        int min1 = X.a[1];
        int hour2 = Y.a[0];
        int min2 = Y.a[1];
        int hourSum = hour1 + hour2;
        int minSum = min1 + min2;
        this.a[0] = hourSum + (minSum/60);
        this.a[1] = minSum%60;
    }

    void disptime() {
        System.out.println("hours = " + this.a[0] + " minutes = " + this.a[1]);
    }

    public static void main(String[] xc){
        Adder obj1 = new Adder();
        Adder obj2 = new Adder();
        Adder sumObj = new Adder();
        obj1.readtime();
        obj2.readtime();
        sumObj.addtime(obj1, obj2);
        sumObj.disptime();
    }
}
