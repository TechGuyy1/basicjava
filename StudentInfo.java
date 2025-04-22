package basicjava;

public class StudentInfo {
    //Parametrize Constructor
public String name;
public  int marks;
   public StudentInfo(String name,int marks){
       this.name=name;
       this.marks=marks;
       System.out.println("Student Name is:"+name + " and Marks: " + marks);
    }
    public void displayStudentdata(){
        System.out.println("In displayStudentdata--> Student Name is:"+name + " and Marks: " + marks);
    }
    //Copy constructor

    public StudentInfo(StudentInfo cpy){
       this.marks= cpy.marks;
       this.name=cpy.name;

        System.out.println("I'm in Copy const--> Student Name is:"+name + " and Marks: " + marks);

    }

    public static void main(String[] args) {
        StudentInfo obj=new StudentInfo("Pavan Kumar",11);
        StudentInfo obj1=new StudentInfo("Rohit Sharma",13);
        StudentInfo obj4=new StudentInfo("Ram Chavan",15);
        obj.displayStudentdata();
        //Initialize copy constructor
StudentInfo obj3=new StudentInfo(obj4);
//        StudentInfo obj5=new StudentInfo(obj4);
    }
}
