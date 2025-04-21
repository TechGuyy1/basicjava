package basicjava;

public class StudentInfo {

    //Parametrize Constructor
public String name;
public  int marks;
   public StudentInfo(String name,int marks){
     this.name=name;
     this.marks=marks;
       System.out.println("Student Name is:"+name);
       System.out.println("and Marks: " + marks);
    }
    public void displayStudentdata(){
        System.out.println("Student Name is:"+name);
        System.out.println("and Marks: " + marks);
    }
    //Copy constructor





    public static void main(String[] args) {
        StudentInfo obj=new StudentInfo("Pavan Kumar",11);//Selenium framework
        obj.displayStudentdata();
//        System.out.println(obj.displayStudentdata());


    }
}
