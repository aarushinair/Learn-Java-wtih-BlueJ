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








š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
