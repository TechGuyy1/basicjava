package basicjava.abcBank;

public class BankAccount extends BankCustomerInfo implements NRIBankAccount {


    //here modifier is private - bankBalance is not accessible outside the class : example for encapsulation
    private double bankBalance;
    public double cashDeposit(double depositAmount){
      return   bankBalance+=depositAmount;//bankBalance=bankBalance+depositAmount
    }
    public double cashWithdraw(double withdrawCash){
      return   bankBalance-=withdrawCash;
    }
    //Overloading Method cashDeposit, Now taking 2 parameter - Compile time polymorphism
    public double cashDeposit(double depositAmount, double depositCharges){
        return   bankBalance+=depositAmount-depositCharges;//bankBalance=bankBalance+depositAmount
    }
    public void displayBalance(){
        System.out.println(custName+"Bank balance is: "+bankBalance+"$");
    }
    //Overriding displayCustInfo method in child class - Run time polymorphism
    public void displayCustInfo(){
        System.out.println("Display customer info "+custName+" |"+mobNumber+" |"+bankBalance);
    }

    @Override
    public double currencyExchange(double usdAmount, double inrRate) {
        return usdAmount*inrRate;
    }
    public static void main(String[] args) {
    BankAccount person1 =new BankAccount();
    person1.displayCustInfo(); //Calling the parent class method -Cust info is not set yet hence it will print Null & 0
    person1.setCustInfo("David Warner",1234567890);
    person1.displayCustInfo();
    person1.cashWithdraw(1000);
    person1.displayBalance();//-1000.0$
    person1.cashDeposit(1500);
    person1.cashDeposit(1500,50);//Method overloaded
    person1.displayBalance();//1950.0$
        person1.displayCustInfo(); //calling method from child class BankAccount
        BankCustomerInfo person2= new BankAccount();
        person2.setCustInfo("Sam Pal",987654310);
        person2.displayCustInfo();//calling method from parent class BankCustomerInfo

    }
}
