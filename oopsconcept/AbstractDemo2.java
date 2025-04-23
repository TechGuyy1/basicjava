package basicjava.oopsconcept;

public class AbstractDemo2 extends  AbstractDemo {
    @Override
    public int sub(int a, int b) {
        return a-b;
    }
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        AbstractDemo2 obj= new AbstractDemo2();
        System.out.println("Abstract Method Implementation: "+  obj.sub(1,2));
        System.out.println("Callig non abstract method: "+  obj.add(2,2));
    }


}