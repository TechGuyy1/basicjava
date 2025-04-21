package basicjava;
public class WhileLoopDemo2 {
    public static void main(String[] args) {
        String students []={"Ram", "Pavan", "Kiran","Me"};
        int stringLenght= students.length;//Length of string is 4
        System.out.println("Length of string is "+stringLenght);
        int cout=0;
        int i=0;
        while (cout<stringLenght){
            System.out.print("Element present at index "+cout);// Element present at index 0
            System.out.println(" is: "+students[cout]);//is: Ram
            cout++;
        }
        do{
            System.out.print("Element present at index "+i);// Element present at index 0
            System.out.println(" is :"+students[i]);//isRam
            i++;
        }while (i>stringLenght);//condition is false still code block will execute once as it is before while condition
    }
}
