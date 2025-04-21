package basicjava;

public class ConstructorDemo1 {
//To initialize an object
    //Its name should be same as like a class name
//Default Constructor
    //java provide implicit cons
public  ConstructorDemo1(){
    System.out.println("Im in constructor of class "); //Explicit
}
   public void disPalay(){
       System.out.println("I'm in reguler/normal method");

   }


   //Parametrized


    public static void main(String[] args) {

       ConstructorDemo1 obj1=new ConstructorDemo1();
       obj1.disPalay();

    }

}
