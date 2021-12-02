import java.io.*;
class SalesBill
{
 String item[]={“Bat”,”Wicket”,”Pad”,”Ball”};
 double rate[]={500,50,300,100};
 String order[]=new String[10];
 double amt[]=new double[10];
 String ans;
 int items[]=new int[10];
 int i,n=0,no,x=0;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 Bill()
 {
 }  
 public void putOrder()throws IOException
 {
     System.out.println("**********************************************");
      System.out.println(“Delhi  Cricket  Kit  Supplier - List of Items”);
      System.out.println("*********************************************");
      System.out.println("Item No.         Item            Rate/item");
      for(i=0;i< 10;i++)
      {
                System.out.println((i+1)+ ":                "+item[i]+"------------------"+rate[i]);
      }
            System.out.println("You have to order at least 2 items. Enter item number to place order\n");  
       
     while(true)
     {
          if(x==10)
          break;
         System.out.println("Enter item number:");
         no=Integer.parseInt(br.readLine());
         order[x]=item[no-1];
         amt[x]=rate[no-1];
         System.out.println("How many items?:");
         no=Integer.parseInt(br.readLine());
         items[x]=no;
         x++;
         if(x>1)
         {
             System.out.println("Any More Item ?(Y/N):");
        ans=br.readLine().toUpperCase();
             if(ans.equals("N"))
             break;
    }
 }
 showBill();
}
private void showBill() throws IOException
{
double bamt=0,b;
double tax=0,tx;
  System.out.println("You have ordered\n");
   System.out.println("Item       Rate         No. of items");
  for(i=0;i< x;i++)
  {
       System.out.println((i+1)+":"+order[i]+"---"+amt[i]+"---"+items[i]);
    }
    while(true)
    {
         if(x< 2)
         break;
         System.out.println("Want to cancel any item (Y/N):");
         ans=br.readLine().toUpperCase();
         if(ans.equals("N"))
         break;
         System.out.println("Which item to cancel, enter item number:");
         no=Integer.parseInt(br.readLine());
         for(i=no-1;i< x-1;i++)
         {
              order[i]=order[i+1];
              amt[i]=amt[i+1];
              items[i]=items[i+1];
            }
            x--;
        }
        System.out.println("Cash Memo\n");
        System.out.println("*****************************************************************");
        System.out.println("Item          Quantity      Rate           Amount\n");
         System.out.println("***************************************************************");
         for (i=0;i< x;i++)
         {
               System.out.print(order[i]+ "             "+items[i]+ "              "+ amt[i]+ "                      ");
      
        b=items[i]*amt[i];
         System.out.println(b);
         bamt=bamt+b;
        }
         System.out.println("Bill Amount Rs.                                     "+bamt);
          System.out.println("*******************");
          if (bamt > 3000 ) tax = .17;else if (bamt > 1500.01 && bamt <= 2999.99) tax = .12;else  tax = .07;
bamt=bamt+bamt*tax;
          System.out.println("Total Amount including Tax Rs.                   "+bamt);
         
}
}






👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
