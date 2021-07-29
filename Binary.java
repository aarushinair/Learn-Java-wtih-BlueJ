import java.io.*;
public class Binary
{
   int a[];
   int n;
   int l;
   int u;
   Binary(int nn){
       n=nn;
       l=0;
       u=n-1;
       a=new int [n];
    }
    void readData () throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
                if (a[i]<a[j]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        System.out.println("The sorted array is");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    int binary_search(int v){
       int pos;
       pos=(l+u)/2;
       if (l>u){
           return (-1);
        }
       else if (v==a[pos]){
           return pos;
        }
        else if (v<a[pos]){
            u=pos;
            return binary_search(v);
        }
        else{
            l=pos;
            return binary_search(v);
        }
    }
    public static void main (String args[]) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter the array size");
        int nn=Integer.parseInt(br.readLine());
        Binary ob=new Binary(nn);
        ob.readData();
        System.out.println("Enter element to search");
        int v=Integer.parseInt(br.readLine());
        int p=ob.binary_search(v);
        if (p!=-1){
        System.out.println("The position at which the element was found\t:"+(p+1));
    }
    else{
        System.out.println("The element was not found");
 }
}
}







👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
