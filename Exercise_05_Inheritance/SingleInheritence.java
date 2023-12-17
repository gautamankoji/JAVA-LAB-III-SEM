/* 5(a). Write a JAVA program to implement Single Inheritance */

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

class SingleInheritence {
    public static void main(String args[]) {
        B b1=new B();
    }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

Inside A's Constructor
Inside B's Constructor

--------------[END-OF-OUTPUT]--------------

*/
