public class OperatorsInJava {
    int a =21;
    int b =2;
    boolean c=true,d=false;
//    1. Arithmatic//    2. Logical//    3. assignmet//    4. Unary//    5. Relational
  public static void main(String args[] ){
      int x=4, y=31;
      System.out.println( y-x);
//      1. Arithmatic
      OperatorsInJava obj=new OperatorsInJava();
      System.out.println("I/m in Arithmatic");
      System.out.print(  "Sum :");
      System.out.println( obj.a + obj.b);
      System.out.println( obj.a + obj.b);
      System.out.print(  "Sub :");
      System.out.println( obj.a - obj.b);
      System.out.println( obj.a / obj.b);
      System.out.println( obj.a % obj.b);
//2. Logical
      System.out.println("Logical");
      System.out.println(obj.c && obj.d);
      //2. Relational operator
      System.out.println("Relational");
      System.out.println(obj.a >= obj.b);
      System.out.println(obj.c || obj.d);
      System.out.println(obj.a <= obj.b);
      System.out.println(obj.a == obj.b);
      System.out.println(obj.a != obj.b);
      //2. Assignment  operator
      System.out.println("Assignment");
      System.out.println(obj.a = obj.b);//Here value of a will change to 2 [assigned a value of variable b to a]
      System.out.println(obj.a += obj.b);// a+b=b 4 2
      System.out.println(obj.a =- obj.b);// a=a-b 2 2
      System.out.println(obj.a =- obj.b);//
      //Unary
      System.out.println("Unary");
      System.out.println(obj.a++);
      System.out.println(--obj.b);



  }
}
