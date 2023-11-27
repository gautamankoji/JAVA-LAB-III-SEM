/* 4.(a) Implementation of Constructor Overloading */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 28-11-2023 01:21:34 
*/

class ConstroctorOverloading {
    int l, b, h = 1;

    // A constructor with no parameters
    ConstroctorOverloading() {
        l = 10;
        b = 20;
    }

    // A constructor with parameters
    ConstroctorOverloading(int u, int v) {
        l = u;
        b = v;
    }
    
    ConstroctorOverloading(int u, int v, int w) {
        l = u;
        b = v;
        h = u + v;
    }

    int area() {
        return (l * b * h);
    }

    public static void main(String args[]) {
        ConstroctorOverloading obj1 = new ConstroctorOverloading();
        ConstroctorOverloading obj2 = new ConstroctorOverloading(5, 19);
        ConstroctorOverloading obj3 = new ConstroctorOverloading(5, 19, 23);
        System.out.println("RESULT: " + obj1.area() + "\n");
        System.out.println("RESULT: " + obj2.area() + "\n");
        System.out.println("RESULT: " + obj3.area());
    }
}

/*	OUTPUT:

RESULT: 200

RESULT: 95

RESULT: 2280

*/
