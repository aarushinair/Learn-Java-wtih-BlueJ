import java.io.*;
public class Fascinating_number
{
  public static void main (String args[]) throws IOException{
      int num;
      BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
      System.out.println("Enter a number");
      num=Integer.parseInt(br.readLine());
      Fascinating_number ob=new Fascinating_number();
      String sum=ob.sumOfNum(num);
      int l=sum.length();
      char arr[]=new char [l];
      for (int i=0;i<l;i++){
      arr[i]=sum.charAt(i);
    }
    char ref[]={'1','2','3','4','5','6','7','8','9'};
    int count=0;
    int sum2=0;
    for (int i=0;i<9;i++){
        for (int j=0;j<l;j++){
       if (ref[i]==arr[j]){
          count ++;
        }
    }
    if (count!= 1){
        break;
    }
    else{
        sum2=sum2+count;
    }
    count=0;
}
if (sum2==9){
    System.out.println("The number is a fascinating number");
}
else{
    System.out.println("The number is not a fascinating number");
}
    }    
    String sumOfNum(int n){
        String s;
        int s2=n*1;
        int s3=n*2;
        int s4=n*3;
        s=s2+""+s3+""+s4;
        return s;
}
}









👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
