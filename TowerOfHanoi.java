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










/*
👋 Hi, I’m @aarushinair — Aarushi Nair (she/her)
🎓 CS Engineer | AI Researcher | Software Engineer | DEI Professional
💡 Interests: AI/ML/DL, Responsible Tech, Innovative Technologies, Ethics in AI
🌍 Advocate for Women in Tech | Community & Events Manager @AnitaB.org India
🎙️ Speaker | Content Creator | STEM Mentor
📫 Let’s connect: https://www.linkedin.com/in/aarushinair/
📹 YouTube: Code with Aarushi → https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🐦 Twitter/X: https://x.com/aarushinair_
📁 Portfolio, projects & talks: https://github.com/aarushinair
*/
