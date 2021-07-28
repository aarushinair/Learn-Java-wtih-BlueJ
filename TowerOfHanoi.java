import java.util.*;
public class TowerOfHanoi
{
    void TOH (int n, char source, char aux, char des)
    {
        if (n>0)
        {
            TOH (n-1, source, des, aux);
            System.out.println ("Move disc "+n+" from "+source+" to "+des);
            TOH(n-1, aux, source, des);
        }
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        TowerOfHanoi obj = new TowerOfHanoi();
        System.out.println ("Enter the number of discs");
        int m = sc.nextInt();
        obj.TOH(m, 'A', 'B', 'C');
    }
}
