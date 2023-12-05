/* 10(b). Write a program illustrating isAlive and join. */

/* AUTHOR
 * Gautam Ankoji
 * Tuesday 05-12-2023 16:51:32
 */

class A extends Thread {
  public void run() {
    try {
      for (int i = 1; i <= 10; i++) {
        sleep(1000);
        System.out.println("good morning");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class B extends Thread {
  public void run() {
    try {
      for (int j = 1; j <= 10; j++) {
        sleep(2000);
        System.out.println("hello");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class C extends Thread {
  public void run() {
    try {
      for (int k = 1; k <= 10; k++) {
        sleep(3000);
        System.out.println("welcome");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class IsAliveAndJoin {
  public static void main(String args[]) {
    A a1 = new A();
    B b1 = new B();
    C c1 = new C();
    a1.start();
    b1.start();
    c1.start();
    System.out.println(a1.isAlive());
    System.out.println(b1.isAlive());
    System.out.println(c1.isAlive());
    try {
      a1.join();
      b1.join();
      c1.join();
    } catch (InterruptedException e) {
      System.out.println(e);
    }
    System.out.println(a1.isAlive());
    System.out.println(b1.isAlive());
    System.out.println(c1.isAlive());
  }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

true
true
true
good morning
hello
good morning
welcome
good morning
hello
good morning
good morning
welcome
hello
good morning
good morning
hello
good morning
welcome
good morning
hello
good morning
welcome
hello
hello
welcome
hello
welcome
hello
hello
welcome
welcome
welcome
welcome
false
false
false

--------------[END-OF-OUTPUT]--------------

*/
