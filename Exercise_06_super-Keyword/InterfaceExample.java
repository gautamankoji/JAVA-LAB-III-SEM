/* 6(b). Write a JAVA program to implement Interface. What kind of Inheritance can be achieved? */

/* AUTHOR
 * Gautam Ankoji
 * Tuesday 05-12-2023 16:43:17
 */

interface A {
  void display();
}

class B implements A {
  public void display() {
    System.out.println("This is in B's method");
  }
}

class C implements A {
  public void display() {
    System.out.println("This is C's method");
  }
}

class InterfaceExample {
  public static void main(String args[]) {
    B b1 = new B();
    C c1 = new C();
    b1.display();
    c1.display();
  }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

This is in B's method
This is C's method

--------------[END-OF-OUTPUT]--------------

*/
