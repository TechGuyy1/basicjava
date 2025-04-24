package basicjava.carproject;

public class BMWCar extends  Car {
 public String momdelName;
 private boolean implogic;


    @Override
    public void followRTORequirement() {
        System.out.println("Followed RTO req plus added extra sefty");
    }

    public static void main(String[] args) {
        BMWCar obj=new BMWCar();//01
        obj.followRTORequirement();
      //  Car obj2= new BMWCar(); //02 --> Actual use?
//  Car obj3= new Car();
//        obj3.followRTORequirement();

    }
}
