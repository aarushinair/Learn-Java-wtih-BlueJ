public class Detail
{
   String name;
   String address;
   int telno;
   int rent;
   Detail(String nm,String a,int tel,int r){
       name=nm;
       address=a;
       telno=tel;
       rent=r;
    }
    void show (){
        System.out.println("The name of the customer:\t"+name);
        System.out.println("The address is:\t"+address);
        System.out.println("The telephone number is :\t"+telno);
        System.out.println("The rent is:\t"+rent);
    }
}
