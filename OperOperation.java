import java.sql.SQLOutput;

public class OperOperation {

    public static void main(String args[]){


        int a=10; //   1010
        int b=7; //
        String c="True";

        //    0111
                       //   0010
        //Bitwise Opertors
        System.out.println(a&b);// AND
        System.out.println(a|b);// OR 15
//         Ternary Opertor --> Short hand for if else
//        Condition? value1:value2
        System.out.println((a>b)?a:b); //True-> hence o/p 10
        System.out.println((a<b)?a:b); //False-> hence o/p 7

        //Relational (Comparison) Operators
        System.out.println( a == b);//Output : false
        System.out.println( a <= b);//Output : false
        System.out.println( a >= b);//Output : true
        System.out.println( a != b);//Output : true
        System.out.println( a >  b);//Output : true
        System.out.println( a <  b);//Output : false

        //Assignment Operators
        System.out.println( a += b);
//        a += b;  // a = a + b, so a becomes 17
        System.out.println(  a -= b);
//        a -= b;  // a = a - b, so a becomes 10
        System.out.println(   a *= b);
//        a *= b;  // a = a * b, so a becomes 70
        System.out.println(   a /= b);
//        a /= b;  // a = a / b, so a becomes 10
        System.out.println(   a %= b);
//          a %= b;  // a = a % b, so a becomes 3
// --> Modulus assignment (%) gives reminder output






    }
}
