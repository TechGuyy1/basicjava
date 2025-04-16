package basicjava;

public class ForLoopDemo {
    public static void main(String[] args) {
        int anArray[]={4,6,3,1};
        //Print all ele of anArray using for looop

//
        for(int i=0;i<=anArray.length-1;i++){
//            System.out.print("Element at index :"+i +"is ");
//            System.out.println(anArray[i]);
            if(i==2){
               break;
            }else {
                System.out.print("Element at index :"+i + "is:");
                System.out.println(anArray[i]);
            }

        }
    }

}
