package basicjava.InterfaceDemo;
public class InterfaceExtend implements  InterfaceDemo{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        InterfaceExtend obj= new InterfaceExtend();
        System.out.println("Sum = "+ obj.add(2,3));
    }


}
