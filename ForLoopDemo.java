package basicjava;

public class ForLoopDemo {
    public static void main(String[] args) {
        int anArray[] = {4, 6, 3, 1};
        //Print all ele of anArray using for loop
        //Systax
        //for(initialize the count;Add condition;increment the count)
        for (int i = 0; i <= anArray.length - 1; i++) {
            System.out.print("Element at index :"+i +" is ");
            System.out.println(anArray[i]);

        }
    }

}
