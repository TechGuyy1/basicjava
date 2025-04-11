import org.w3c.dom.ls.LSOutput;

public class StringOperation {
String s="Pavan Kumar";
String s1="pavan kumar";

String str= new String();
public static void main(String args[]){

    StringOperation soObje=new StringOperation();
    System.out.println(soObje.s.length());
    System.out.println(soObje.s.toLowerCase());
    System.out.println(soObje.s.toUpperCase());
    System.out.println(soObje.s.compareToIgnoreCase(soObje.s1));
    System.out.println(soObje.s.equals(soObje.s1));
    System.out.println(soObje.s.equalsIgnoreCase(soObje.s1));

}
}
