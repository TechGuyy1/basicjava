package basicjava.abcBank;
public class BankCustomerInfo {
    public String custName;
    public int mobNumber;
    public void setCustInfo(String custName, int mobNumber){
        this.custName=custName;
        this.mobNumber=mobNumber;
    }
    public void displayCustInfo(){
        System.out.println("Customer name is :"+ custName +" Mobile No: "+mobNumber);
    }
}
