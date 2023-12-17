/* 13(b). What is the difference between HashSet and TreeSet? Implement a Program to show the differences. */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 05-12-2023 16:54:16 
*/

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetVsTreeSet {
    public static void main(String[] args) {
        // HashSet Example
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Banana"); // Duplicate element, won't be added

        System.out.println("HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // TreeSet Example
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        // treeSet.add(null); // Uncommenting this line will result in a NullPointerException

        System.out.println("\nTreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

HashSet:
Apple
Grapes
Orange
Banana

TreeSet:
Apple
Banana
Grapes
Orange

--------------[END-OF-OUTPUT]--------------

*/
