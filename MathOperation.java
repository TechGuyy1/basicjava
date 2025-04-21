package basicjava;

public class MathOperation {
    int a;
    int b;
   public MathOperation(){
        System.out.println("Hey, Performing Math Operation!!");
    }
    public void add(int a, int b, int c){
   int sum=a+b+c;
   System.out.println(sum);
    }
    public void sub(int a, int b){
        int sub=a-b;
        System.out.println(sub);
    }
    public static void main(String args[]){
        MathOperation operation=new MathOperation();
        operation.add(4,5,6);
        operation.sub(7,9);
        operation.add( operation.a=11,5,6);
        String s= "rM";
        int I=0;

    }
}
