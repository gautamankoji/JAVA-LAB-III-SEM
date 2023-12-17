/* 5(b). Write a JAVA program to implement multi-level Inheritance */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 05-12-2023 16:39:57 
*/

class A {
    A() {
        System.out.println("Inside A's Constructor");
    }
}
class B extends A {
    B() {
        System.out.println("Inside B's Constructor");
    }
}
class C extends B {
    C() {
        System.out.println("Inside C's Constructor");
    }
}
class MultiLevelInheritence {
    public static void main(String args[]) {
        C c1=new C();
    }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

Inside A's Constructor
Inside B's Constructor
Inside C's Constructor

--------------[END-OF-OUTPUT]--------------

*/
