public class Stock
{
   String item;
   int qty;
   int rate;
   int amt;
   Stock(String n,int q,int r){
       qty=q;
       item=n;
       rate=r;
       amt=rate*qty;
    }
    void display(){
        System.out.println("Stock details:");
        System.out.println("Item:"+item);
        System.out.println("Quantity:"+qty);
        System.out.println("Rate:"+rate);
        System.out.println("Amount:"+amt);
    }
}
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
public class Purchase extends Stock  {
    int pqty;
    int prate;
    Purchase(String n,int q,int r,int pq,int pr){
        super(n,q,r);
        pqty=pq;
        prate=pr;
    }
    void update(){
        qty=qty+pqty;
        if(prate!=rate){
            rate=prate;
            amt=qty*rate;
        }
    }
    void display(){
        System.out.println("The stock before updating:");
        super.display();
        update();
        System.out.println("Stock after updating:");
        System.out.println("Quantity:"+qty);
        System.out.println("Rate:"+rate);
        System.out.println("Amount:"+amt);
    }
    public static void main(String args[]){
        Purchase ob=new Purchase("shirt",300,5,200,6);
       ob.display();
       
    }
}
