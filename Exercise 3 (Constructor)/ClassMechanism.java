/* 3.(a) Implementation of class mechanism – Create a class, methods and invoke them inside main method */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 28-11-2023 00:51:40 
*/

public class ClassMechanism {
    // no return type and without parameter-list
    int l = 10, b = 20;
    void display1() {
        System.out.println(l + " " + b);
    }

    // no return type and with parameter-list
    void display2(int l, int b) {
        System.out.println(l + " " + b);
    }

    // return type and without parameter-list
    int area1() {
        return (l * b);
    }

    // return type and with parameter-list
    int area2(int l, int b) {
        return (l * b);
    }

    // Main Method 
    public static void main(String args[]) {
        ClassMechanism obj1 = new ClassMechanism();
        obj1.display1();
        System.out.println();
        obj1.display2(6, 23);
        System.out.println();
        System.out.println(obj1.area1());
        System.out.println();
        System.out.println(obj1.area2(5, 9));
        System.out.println();
    }
}


/*	OUTPUT:

10 20

6 23

200

45

*/
