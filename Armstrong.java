import java.io.*;
class Armstrong
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int p,sum=0,c,spy=0,i;

public void takeData() throws IOException
{
System.out.println("Enter the number:-");
i=Integer.parseInt(br.readLine());
p=i;
while(p>9)
{
spy=1;
c=p%10;
sum=sum+(int)Math.pow(c,3);
p=p/10;
}
if(spy==1)
{
sum=sum+(int)Math.pow(p,3);
if(sum==i)
System.out.println(i+ " is amstrong number");
else
System.out.println("Not amstrong number.");
}
else
System.out.println("Not possible.");
}
public static void main(String args[])throws IOException
{
Armstrong obj=new Armstrong();
obj.takeData();
}
}





👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
