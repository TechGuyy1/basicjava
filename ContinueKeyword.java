package basicjava;

public class ContinueKeyword {
    public static void main(String[] args) {
        String students[]={"Ram", "Pavan", "Kiran","Me"};
        int stringLenght= students.length;//Length of string is 3
        System.out.println("Length of string is "+stringLenght);
        int cout=0;
        while (cout<stringLenght){
            if(students[cout]=="Pavan"){
                cout++;
              continue;
            }
            System.out.print("Element present at index "+cout);// Element present at index 0
            System.out.println(" is :"+students[cout]);//i
            cout++;
        }
    }
}
