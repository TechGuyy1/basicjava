package basicjava;

public class ConstructorDemo1 {
    //To initialize an object
    //Its name should be same as like a class name
    //Default Constructor
    //java provide implicit constructor when no explicit constructor defined
    public ConstructorDemo1() {
        System.out.println("I'm in explicit default constructor of class"); //Explicit
    }
    public void display() {
        System.out.println("I'm in display method");
    }
    //Parametrized
    public static void main(String[] args) {
        ConstructorDemo1 obj1 = new ConstructorDemo1();
        obj1.display();
    }
}
