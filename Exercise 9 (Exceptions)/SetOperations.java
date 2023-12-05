/* 9(e). Write a Program to implement set and set Operations. */

/* AUTHOR
 * Gautam Ankoji
 * Tuesday 05-12-2023 16:50:12
 */

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
  public static void main(String[] args) {
    // Creating sets
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    // Adding elements to set1
    set1.add(1);
    set1.add(2);
    set1.add(3);
    set1.add(4);

    // Adding elements to set2
    set2.add(3);
    set2.add(4);
    set2.add(5);
    set2.add(6);

    // Displaying the sets
    System.out.println("Set 1: " + set1);
    System.out.println("Set 2: " + set2);

    // Union of sets
    Set<Integer> unionSet = new HashSet<>(set1);
    unionSet.addAll(set2);
    System.out.println("Union of sets: " + unionSet);

    // Intersection of sets
    Set<Integer> intersectionSet = new HashSet<>(set1);
    intersectionSet.retainAll(set2);
    System.out.println("Intersection of sets: " + intersectionSet);

    // Difference of sets (set1 - set2)
    Set<Integer> differenceSet = new HashSet<>(set1);
    differenceSet.removeAll(set2);
    System.out.println("Difference of sets (Set1 - Set2): " + differenceSet);

    // Difference of sets (set2 - set1)
    differenceSet = new HashSet<>(set2);
    differenceSet.removeAll(set1);
    System.out.println("Difference of sets (Set2 - Set1): " + differenceSet);
  }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

Set 1: [1, 2, 3, 4]
Set 2: [3, 4, 5, 6]
Union of sets: [1, 2, 3, 4, 5, 6]
Intersection of sets: [3, 4]
Difference of sets (Set1 - Set2): [1, 2]
Difference of sets (Set2 - Set1): [5, 6]

--------------[END-OF-OUTPUT]--------------

*/
