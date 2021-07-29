import java.util.*;
public class Combine
{
   int com[];
   int size;
   Combine(int nn){
       size=nn;
       com=new int[size];
    }
    void inputarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        for(int i=0;i<size;i++){
            int val=sc.nextInt();
            com[i]=val;
        }
    }
    void sort(){
        
            int i , j , small , tmp = 0 , pos = 0 ;
           
            for ( i = 0 ; i <size ; i++) {
                small = com[i] ;
                pos = i ;
            for ( j = i + 1 ; j < size ; j++) {
                if (com[j] < small) {
                    small = com[j] ;
                    pos = j ;
                }
            }
        
          tmp=com[i] ;
          com[i]=com[pos] ;
          com[pos]=tmp ;
      }
   }
   void mix(Combine A,Combine B){
       int k;
       for(k=0;k<A.size;k++){
           this.com[k]=A.com[k];
        }
       for(int a=0;a<B.size;a++){
           this.com[k++]=B.com[a];
        }
    }
    void display(){
        System.out.println("displaying meged and sorted array");
        for(int u=0;u<size;u++){
        System.out.println(this.com[u]);
    }
} 
   public static void main(String args[]){
       System.out.println("Enter size of both elements");
  Scanner sc = new Scanner(System.in);
  int si = sc.nextInt();
  Combine A = new Combine(si);
  Combine B = new Combine(si);
  Combine c = new Combine(si+si);
  A.inputarray();
  B.inputarray();
  c.mix(A,B);
  c.sort();
  c.display();
}
}







👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
