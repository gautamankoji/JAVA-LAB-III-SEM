/* 3.(b) Implementation of Constructor in Java */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 28-11-2023 01:21:42 
*/

public class JavaConstructor {
    int l, b;

    // A constructor with no parameters
    JavaConstructor() {
        l = 10;
        b = 20;
    }

    // A constructor with parameters
    JavaConstructor(int u, int v) {
        l = u;
        b = v;
    }

    int area() {
        return (l * b);
    }

    public static void main(String args[]) {
        JavaConstructor obj1 = new JavaConstructor();
        JavaConstructor obj2 = new JavaConstructor(5, 19);
        int res1 = obj1.area();
        int res2 = obj2.area();
        System.out.println("RESULT: " + res1 + "\n");
        System.out.println("RESULT: " + res2);
    }
}

/*	OUTPUT:

RESULT: 200

RESULT: 95

*/
