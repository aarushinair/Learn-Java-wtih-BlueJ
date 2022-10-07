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



👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
