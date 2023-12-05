/* 13(c). What is the difference between Set and Map? Implement a Program to show the differences. */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 05-12-2023 16:54:33 
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetVsMap {
    public static void main(String[] args) {
        // Set Example
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate element, won't be added

        System.out.println("Set:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Orange", 5);
        map.put("Apple", 7); // Overwrites the previous value associated with "Apple"

        System.out.println("\nMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

Set:
Apple
Orange
Banana

Map:
Apple: 7
Orange: 5
Banana: 2

--------------[END-OF-OUTPUT]--------------

*/
