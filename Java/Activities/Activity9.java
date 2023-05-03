package Activities;


import java.util.ArrayList;
//import java.util.*;
public class Activity9 {
    public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Madhu");
        myList.add("Nikhil");
        myList.add("Ram");
        //Adding object at specific index
        myList.add(2, "Surya");
        myList.add(1, "Smita");

//        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }

        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Surya is in list: " + myList.contains("Surya"));
        System.out.println("Size of ArrayList: " + myList.size());

        myList.remove("Smita");

        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
//import java.util.ArrayList;
//public class Activity9 {
//    public static void main(String[] args) {
//        ArrayList<String> myList = new ArrayList<String>();
//        myList.add("Joy");
//        myList.add("John");
//        myList.add("Jemmy");
//        myList.add("Tim");
//        myList.add("Sarah");
//        System.out.println(myList.size());
//        myList.get(2);
//        myList.contains("Jemmy");
//        myList.remove("Tim");
//        System.out.println(myList.size());
//    }
//}

