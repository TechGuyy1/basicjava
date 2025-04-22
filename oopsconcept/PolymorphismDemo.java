package basicjava.oopsconcept;

public class PolymorphismDemo extends BankAccount{
   int sum;
   //Method overloading - Compile Time Polymorphism
    public void add(int a, int b){
        sum=a+b;
        System.out.println(sum);
    }
    public void add(int a, int b, int c){
        sum=a+b+c;
        System.out.println(sum);
    }
    //Method overriding  - Method name return type and args are same
    public void cashDeposit(double cashDeposit){
        double charges=10;
        balance+=cashDeposit-charges; //balance=balance+cashDeposit;
        System.out.println(balance);
    }

    public static void main(String[] args) {
        PolymorphismDemo obj=new PolymorphismDemo();
        obj.add(2,3,4);
        obj.add(2,3);
        obj.cashDeposit(100);//Calling the
        BankAccount obj1= new PolymorphismDemo();//Created a obj of BankAccount to call the method of Bankact
        obj1.cashDeposit(500);//Reffering bank account method
    }


}
