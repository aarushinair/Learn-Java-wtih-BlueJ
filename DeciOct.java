import java.util.* ;
public class DeciOct
{
    int n , oct ;
    DeciOct(){
    n = 0 ;
    oct = 0 ;
    }
    void getoct(int nn){
    n = nn ;
    }
    void deci_oct(){
    if(n > 7){
    oct += (n / 8) ;
    n /= 8 ;
    oct *= 10 ;
    deci_oct() ;
    }
    else{
    oct += n ;
    }
    }
    void show(){
    System.out.println("Answer is:" + oct) ;
    }
    public static void main(String[] xc){
    Scanner rk = new Scanner(System.in) ;
    System.out.println("Enter number") ;
    int n = rk.nextInt() ;
    DeciOct rr = new DeciOct() ;
    rr.getoct(n) ;
    rr.deci_oct() ;
    rr.show() ;
    }
}
