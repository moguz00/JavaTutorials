package oguz.tutorials.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by oguz on 4.1.2017.
 *
 * Sets do not contain duplicate elements. Which means if obj1.equals(obj2)
 * these two objects cannot be in the same set.
 */
public class SetInterface {

    private static Set<String> hashSet = new HashSet<>();

    public static void main(String[] args) {

        System.out.println("Set interface do not allow duplicate elements");
        hashSet.add("Obama");
        hashSet.add("Putin");
        hashSet.add("Erdogan");
        System.out.println(hashSet.toString());
        hashSet.add("Obama");
        System.out.println(hashSet.toString());
        hashSet.remove("Obama");
        System.out.println(hashSet.toString());

        System.out.println("Print elements through iterator");

        Iterator<String> it = hashSet.iterator();

        while(it.hasNext()) {
            System.out.print(it.next().toString() + " ");
        }
    }
}