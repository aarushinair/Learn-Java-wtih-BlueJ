public class Bank
{
  String name;
  double accno;
  double p;
  Bank(String n,double a,double k){
      name=n;
      accno=a;
      p=k;
    }
    void display(){
        System.out.println("Bank Details:");
        System.out.println("Name:"+name);
        System.out.println("Account Number:"+accno);
        System.out.println("Principal Ammount:"+p);
    }
}

xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
public class Account extends Bank
{
  double amt;
  Account(String n,double a,double k,double am){
      super(n,a,k);
      amt=am;
    }
    void deposit(){
       p=p+amt;
       
        System.out.println(amt);
    }
    void withdraw(){
        p=p-amt;
        if(amt>=p){
            System.out.println("INSUFFICIENT BALANCE");
        }
        else if((p-amt)<500){
             p=(p-(p-500))*10;
            System.out.println("The Penalty is:"+p);
        }
        else{
            System.out.println("The Money Left in the Account is:"+(p-amt));
        }
    }
    void display(){
        System.out.println("Bank Details Before Withdrawl:");
        super.display();
        System.out.println("Details After Deposit:");
        deposit();
        System.out.println("Details After Withdraw:");
        withdraw();
        
            
    }
    public static void main(String args[]){
        Account ob=new Account("Aarushi",123456,5000,4000);
        ob.display();
    }
}








š Hi, Iām @aarushinair - Aarushi Nair (she/her/ella)
š Iām a Computer Science Engineering Student
šļø Iām looking to collaborate on #java, #python, #R, #applicationdevelopment
š± #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
š« How to reach me: https://www.linkedin.com/in/aarushinair/
š©āš« YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
šā Follow me on Twitter: https://twitter.com/aarushinair_
