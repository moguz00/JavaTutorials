package oguz.tutorials.collections;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by oguz on 5.1.2017.
 */
public class Sorting {

    public static void main(String[] args) {

        int[] unsortedArray = {3, 2, 5, 4, 1};
        System.out.println("Unsorted Array: " + unsortedArray.toString());

        Arrays.sort(unsortedArray);
        System.out.println("Sorted Array: " + unsortedArray.toString());

        System.out.println(Arrays.binarySearch(unsortedArray, 2));
        System.out.println(Arrays.binarySearch(unsortedArray, 6));   //One less than the negated index of where the value 6 would need to be "-6"

        /**
         * Autoboxing automatically converts primitive types to corresponding Wrapper Classes
         * Unboxing automatically converts Wrapper classes to primitive types
         */

        /**
         * Diamond operator
         * Before JDK1.5
         * List names = new ArrayList();
         * List<String> names = new ArrayList<String>();
         * With Java 7
         * List<String> names = new ArrayList<>();
         */

        //Instead of
        HashMap<String, HashMap<String, String>> map1 = new HashMap<String, HashMap<String, String>>();
        //Write this
        HashMap<String, HashMap<String, String>> map2 = new HashMap<>();


    }
}
