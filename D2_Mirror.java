import java.util.* ;
public class D2_Mirror
{
    public static void main(String [] xc){
    Scanner rk = new Scanner(System.in) ;
    int l , arr[][] , mat[][] , i , j ;
    System.out.println("Enter matrix order greater than 2 but lesser than 20") ;
    l = rk.nextInt() ;
    if(l > 2 && l < 20){
    arr = new int[l][l] ; 
    mat = new int[l][l] ;
    System.out.println("Enter integer array elements only") ;
    for(i = 0 ; i < l ; i ++){
    for(j = 0 ; j < l ; j ++)
    arr[i][j] = rk.nextInt() ;
    }
    System.out.println("\n") ;
    for(i = 0 ; i < l ; i ++){
    for(j = 0 ; j < l ; j ++)
    System.out.print(arr[i][j] + "\t") ;
    System.out.println() ; 
    }
    System.out.println("\n") ;
    
    for(i = 0 ; i < l ; i ++){
    for(j = 0 ; j < l ; j ++)
    mat[i][j] = arr[i][l - j - 1] ;
    }
    
    for(i = 0 ; i < l ; i ++){
    for(j = 0 ; j < l ; j ++)
    System.out.print(mat[i][j] + "\t") ;
    System.out.println() ; 
    }
   }
   else
   System.out.println("Invalid Value") ;
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
