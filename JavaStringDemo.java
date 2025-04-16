package basicjava;
public class JavaStringDemo {
    public static void main(String[] args) {
        String str = "Selenium Automation";
        // Length
        int len = str.length(); // 19
        System.out.println("String Length:"+len);
        // Substring
        String sub = str.substring(5, 16);//ium Automat --> From ind 5 to 16
        System.out.println("Sub string is: "+sub);
        String lower = str.toLowerCase();
        String upper = str.toUpperCase();
        // Replace
        String replaced = str.replace("Selenium", "Selenium-Java");//
        System.out.println("String after replacement:"+replaced);
        boolean isEqual = str.equals("Selenium Automation"); //true
        boolean ignoreCase = str.equalsIgnoreCase("selenium automation");//true
    }
}
