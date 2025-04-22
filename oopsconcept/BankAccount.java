package basicjava.oopsconcept;

public class BankAccount extends CustInfo {
    public double balance;
    public void cashDeposit(double cashDeposit){
        balance+=cashDeposit; //balance=balance+cashDeposit;
    }
    public  void displayBalance(){
        System.out.println("Balance is :"+balance+"$");
    }
    //Method Loading -> Compile
    //Method name is same,
    public double cashWith(double cashdrown){
      return balance=balance-cashdrown;
    }

    public static void main(String[] args) {
        BankAccount person1=new BankAccount();
        person1.cashDeposit(1000);
        person1.cashDeposit(2000);
        person1.displayBalance();
        person1.displayCustInfo();
        person1.cashWith(1400);
//        System.out.println( person1.cashWith(1400));
        person1.displayBalance();

    }



}
