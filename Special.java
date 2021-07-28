import java.util.*;
 public  class special
 {
  static int n;
  static int p=1;
  static int s,e,t,r,u;
  static int y;
 
     
   special(){
       n=0;
     }
      special(int c){
         c=n;
         y=n;
     }
      public static void isspecial(){
         for(int i=n;i>0;i--){
         s=n%10;
         if(s>0){
            p=p*s*s-1;
            e=e+p;
            s--;
         }
         n=n/10;
        
         
         
     }
      if(e==y){
             System.out.println("The number is a special number");
         }
         else{
             System.out.println("The number is not a special number");
         }
        
 }
 
  static void sum(){
     t=y%10;
     r=y/100;
     u=t+r;
     System.out.println(u);
 }
 
 public static void main(String args[]){
     special obj=new special(145);
     isspecial();
     
     sum();
 }
 }
