import java.util.*;
public class Collection
{
   int a1[];
   int l;
   Collection(){
      a1=null;
      l=0;
    }
    Collection(int length){
       l=length;
        a1=new int [l];
    }
    void readArray() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        for (int i=0;i<l;i++){
            a1[i]=sc.nextInt();
        }
    }
    Collection common (Collection A){
       Collection c=new Collection (l);
       int p=0;
       for (int i=0;i<this.l;i++){
           for (int j=0;j<A.l;j++){
               if (this.a1[i]==A.a1[j]){
                   c.a1[p]=this.a1[i];
                   p++;
                }
            }
        }
        return c;
    }
    void displayArray(){
        System.out.println("The common array is ");
        for (int i=0;i<l;i++){
            if (a1[i]!=0){
            System.out.println(a1[i]);
        }
        }
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int le =sc.nextInt();
        Collection P=new Collection (le);
        Collection Q=new Collection (le);
        P.readArray();
        Q.readArray();
        Collection R=P.common(Q);
        R.displayArray();
    }
  }








👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
