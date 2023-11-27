/* 4.(b) Implementation of Method Overloading */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 28-11-2023 01:22:30 
*/

class MethodOverloading {
    int l = 5, b = 9;
    int area() {
        return (l * b);
    }

    int area(int l, int b) {
        return (l * b);
    }

    int area(int l, int b, int h) {
        return (l * b * h);
    }

    public static void main(String args[]) {
        MethodOverloading obj1 = new MethodOverloading();
        System.out.println("RESULT: " + obj1.area() + "\n");
        System.out.println("RESULT: " + obj1.area(2, 7) + "\n");
        System.out.println("RESULT: " + obj1.area(12, 32, 2));
    }
}

/*	OUTPUT:

RESULT: 45

RESULT: 14

RESULT: 768

*/
