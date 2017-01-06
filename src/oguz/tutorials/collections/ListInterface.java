package oguz.tutorials.collections;

import java.util.*;

/**
 * Created by oguz on 20.12.2016.
 *
 *
 * ArrayList LinkedList
 * List is an ordered sequence of the data
 */
public class ListInterface {

    /*
    ArrayList is usually better performing, but LinkedList performs better under certain circumstances.
     */
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Collection interface add, remove method \nList interface allows duplicate entries");
        arrayList.add(0, 2); //Add 2 to 0th location
        arrayList.add(3);   //Autoboxes primitive int to object Integer
        arrayList.add(4);   //Allows duplicate entries
        arrayList.add(4);

        //arrayList.remove(4);    //Since there is not 4th location it give IndexOutOfBoundsException
        arrayList.remove(2);    //Deletes the object at location 2 which is one of the 4, remove
        arrayList.remove(new Integer(2));   //Searches for the object Integer(2) which is at the location 0 and deletes it
        //arrayList.remove(new Integer(7));   //Searches for the object Integer(7) which does not exists, thhrows NoSuchElementException

        System.out.println(arrayList);

        System.out.println("Print Array List through iterator");
        Iterator<Integer> it = arrayList.iterator();

        while (it.hasNext()) {
            String s = it.next().toString();
            System.out.print(s + " ");
        }
        System.out.println("");

        Integer[] intArray = {1, 2, 3};   //Cannot use int[], incompatible types: inference variable T java.lang.Integer - int
        List<Integer> intList = Arrays.asList(intArray);

        //System.out.println("Array created: " + intArray.toString());
        System.out.println("List created from Array: " + intList.toString());

        intArray[0] = 4;
        intList.set(1, 5);
        //intList.remove(0);   //throws java.lang.UnsupportedOperationException because length of an Array can not be changeds

        //System.out.println("Array created: " + intArray.toString());
        System.out.println("List created from Array: " + intList.toString());

        System.out.println(" ");

        System.out.println("Collection interface add, remove method \nList interface allows duplicate entries");
        linkedList.add(3);
        linkedList.add(0, 2);    //Add 2 to 0th location
        linkedList.add(4);      //Allows duplicate entries
        linkedList.add(4);

        //linkedList.remove(4);    //Since there is not 4th location it gives IndexOutOfBoundsException
        linkedList.remove(2);    //Deletes the object at location 2 which is one of the 4, remove
        linkedList.remove(new Integer(2));   //Searches for the object Integer(2) which is at the location 0 and deletes it
        //linkedList.remove(new Integer(7));   //Searches for the object Integer(7) which does not exists, thhrows NoSuchElementException

        System.out.println(linkedList);

        System.out.println("Print LinkedList through iterator");
        for (Iterator itLinkedList = linkedList.iterator(); itLinkedList.hasNext(); ) {
            String s = itLinkedList.next().toString();
            System.out.print(s + " ");
        }
    }
}