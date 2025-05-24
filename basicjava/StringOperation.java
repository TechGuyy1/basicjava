package basicjava;

import java.util.Scanner;

public class StringOperation {
String s="aa"; //80+85
String s1="pp";//80+80
String str= new String();
public static int sum(int a, int b){


    return a+b;
}
    public static void sum(int a, int b, int c){

        System.out.println(a+b+c);
    }

    public void sub(int a, int b){
        System.out.println(a-b);

    }
public static void main(String args[]){

    StringOperation soObje=new StringOperation();
//    System.out.println(soObje.s.length());
//    System.out.println(soObje.s.toLowerCase());
//    System.out.println(soObje.s.toUpperCase());
    System.out.println(soObje.s.compareToIgnoreCase(soObje.s1));
//    System.out.println(soObje.s.equals(soObje.s1));
//    System.out.println(soObje.s.equalsIgnoreCase(soObje.s1));

    System.out.println(sum(3,4));
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of c :" );
    int c= sc.nextInt();
    System.out.println("Enter value of d :" );
    int d= sc.nextInt();
    System.out.println( sum(c,d));;
    sum(1,2,3);
//    System.out.println(sum(1,2,4));
    StringOperation so=new StringOperation();
    so.sub(sum(1,3),5);

}
}
