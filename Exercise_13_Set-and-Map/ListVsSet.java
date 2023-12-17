/* 13(a). What is the difference between List and Set? Implement a Program to show the differences. */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 05-12-2023 16:54:04 
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSet {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple"); // Duplicate element

        System.out.println("List:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Set Example
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate element, won't be added

        System.out.println("\nSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

List:
Apple
Banana
Orange
Apple

Set:
Apple
Orange
Banana

--------------[END-OF-OUTPUT]--------------

*/
