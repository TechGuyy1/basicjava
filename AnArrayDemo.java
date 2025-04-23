package basicjava;

public class AnArrayDemo   {
    public static void main(String[] args) {
        //Single dim array
        //Declearing an array
        //One way of ...
        int arrayOfInt[];
        arrayOfInt = new int[3];
        arrayOfInt[0] = 33;
        arrayOfInt[1] = 34;
        arrayOfInt[2] = 35;
        System.out.println("Element present at 1 st index is : " + arrayOfInt[1]);
        //2nd way - short cut
        int arryOfInt1[] = {1, 2, 3, 4, 5};  //Size of an array is 5
        System.out.println("Element present at 2nd index is :" + arryOfInt1[2]);//3
        System.out.println("Element present at 4th index is :" + arryOfInt1[4]);//5
//
        // Two Dimentional arrray
        int twoDimArray[][] = {{1, 2},
                {3, 4}};
        //In Interview : -> Multiplication/addition/Division/ Substraction of 2DM array
        System.out.println("Element at index [0][1]" + twoDimArray[0][1]);//2
        System.out.println("Element at index [1][0]" + twoDimArray[1][0]);//3
        System.out.println("Get the length of an arrayOfInt: " + arrayOfInt.length);

    }

}
