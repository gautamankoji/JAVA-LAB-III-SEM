/* 8(a). Write a JAVA program that implements Runtime polymorphism */

/* AUTHOR
 * Gautam Ankoji
 * Tuesday 05-12-2023 16:48:27
 */

class A {
  void display() {
    System.out.println("Inside A class");
  }
}

class B extends A {
  void display() {
    System.out.println("Inside B class");
  }
}

class C extends A {
  void display() {
    System.out.println("Inside C class");
  }
}

class RuntimePolymorphism {
  public static void main(String args[]) {
    A a1 = new A();
    B b1 = new B();
    C c1 = new C();
    A ref;
    ref = c1;
    ref.display();
    ref = b1;
    ref.display();
    ref = a1;
    ref.display();
  }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

Inside C class
Inside B class
Inside A class

--------------[END-OF-OUTPUT]--------------

*/
