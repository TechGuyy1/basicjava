package basicjava.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> studName=new ArrayList<>();
        studName.add("ram");
        studName.add("pavan");
        studName.add("kiran");
        System.out.println("Name at index 2"+studName.get(2));
        for(int i=0; i<10;i++){
            String name="name"+i;
            studName.add(name);
        }
        for(int i=0; i<10;i++){
            System.out.println(studName.get(i));
        }

    }

}
