package basicjava;

public class ConstructorDemo {
    //Parametrize Constructor
    public ConstructorDemo(int i, int i1) {
        System.out.println(i+i1);
    }
   //Method
    public void normalMethod(int a, int b){
        System.out.println(a+b);

    }
    //Default constructor
    public ConstructorDemo() {
        System.out.println("No arg constructor");
    }

    public static void main(String[] args) {
        ConstructorDemo obj= new ConstructorDemo(3,3);
        obj.normalMethod(5,6);
        obj.normalMethod(6,5);
        //constructor only called once
        ConstructorDemo obj2= new ConstructorDemo(5,3);
     //   ConstructorDemo obj1= new ConstructorDemo();
    }
}
