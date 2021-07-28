//java program to calculate simple interest
public class SimpleInterest {

    public void calculate(int principal, int time, int rate) {

        double interest = principal * time * rate / 100;

        double amount = principal + interest;

        System.out.println("Interest is " + interest);

        System.out.println("Amount is " + amount);

  }

}
