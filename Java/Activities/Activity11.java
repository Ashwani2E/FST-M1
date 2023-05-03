package Activities;

import java.util.HashMap;
import java.util.Map;

//import java.util.*;
//
//public class Activity11 {
//    public static void main(String[] args) {
//        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
//        hash_map.put(1, "White");
//        hash_map.put(2, "Blue");
//        hash_map.put(3, "Pink");
//        hash_map.put(4, "Green");
//        hash_map.put(5, "Black");
//
//        // Print the Map
//        System.out.println("The Original map: " + hash_map);
//
//        // Remove one colour
//        hash_map.remove(3);
//        // Map after removing a colour
//        System.out.println("After removing Pink: " + hash_map);
//
//        // Check if green exists
//        if(hash_map.containsValue("Green")) {
//            System.out.println("Green exists in the Map");
//        } else {
//            System.out.println("Green does not exist in the Map");
//        }
//
//        // Print the size of the Map
//        System.out.println("Size of Map is: " + hash_map.size());
//    }
//}


public class Activity11 {
    public static void main(String[] args) {
        // create a Map named colours with integer keys and String values
        Map<Integer, String> colours = new HashMap<Integer, String>();

        // add 5 random colours to the Map
        colours.put(1, "red");
        colours.put(2, "green");
        colours.put(3, "blue");
        colours.put(4, "yellow");
        colours.put(5, "purple");

        // print the Map to the console
        System.out.println("colours: " + colours);

        // remove one colour using the remove() method
        colours.remove(4);

        // check if the colour green exists in the Map using the containsValue() method
        if (colours.containsValue("green")) {
            System.out.println("The Map contains the colour green");
        } else {
            System.out.println("The Map does not contain the colour green");
        }

        // print the size of the Map using the size() method
        System.out.println("The size of the Map is " + colours.size());
        System.out.println("colours: " + colours);
    }
}