package oguz.tutorials.collections;

import java.util.*;

/**
 * Created by oguz on 22.12.2016.
 *
 * Map data structure holds key value pairs. Only one unique key can
 * exists in a map. This class takes place of the old Dictionary class.
 * If mutable objects are used in keys and their value changes, the
 * behaviour of the map is not specified.
 *
 */
public class MapInterface {

    Map<String, Integer> hashMap = new HashMap<>();
    Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
    Map<Integer, String> sortedTreeMap = new TreeMap<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();



    }


}
