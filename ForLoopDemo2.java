package basicjava;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        String students[]={"Ram", "Pavan", "Kiram"};
      int stringLenght= students.length;//Length of string is 3
        System.out.println("Length of string is "+stringLenght);
        int cout=0;
        for (cout=0;cout<stringLenght;cout++){
         if(cout==1){
             continue;
         }
            System.out.print("Element present at index "+cout);// Element present at index 0
            System.out.println(" is"+students[cout]);//isRam
        }
        for(cout=stringLenght-1;cout>=0;cout--){

            if(students[cout]=="Pavan"){
                System.out.println(students[cout] +"is available in class");
            }
            else {
                System.out.println("Printing Else");
            }
        }
    }
}
