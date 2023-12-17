/* 10(a). Write a JAVA program that creates threads by extending Thread class. First thread display “Good Morning“! every 1 sec, the second thread displays “Hello“! every 2 seconds and the third display “Welcome!” every 3 seconds, (Repeat the same by implementing Runnable) */

/* AUTHOR
 * Gautam Ankoji
 * Tuesday 05-12-2023 16:51:00
 */

class A implements Runnable {
  public void run() {
    try {
      for (int i = 1; i <= 10; i++) {
        Thread.sleep(1000);
        System.out.println("Good Morning!");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class B implements Runnable {
  public void run() {
    try {
      for (int j = 1; j <= 10; j++) {
        Thread.sleep(2000);
        System.out.println("Hello!");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class C implements Runnable {
  public void run() {
    try {
      for (int k = 1; k <= 10; k++) {
        Thread.sleep(3000);
        System.out.println("Welcome!");
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class ThreadsWithRunnable {
  public static void main(String args[]) {
    A a1 = new A();
    B b1 = new B();
    C c1 = new C();
    Thread t1 = new Thread(a1);
    Thread t2 = new Thread(b1);
    Thread t3 = new Thread(c1);
    t1.start();
    t2.start();
    t3.start();
  }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

Good Morning!
Good Morning!
Hello!
Welcome!
Good Morning!
Hello!
Good Morning!
Good Morning!
Welcome!
Hello!
Good Morning!
Good Morning!
Hello!
Good Morning!
Welcome!
Good Morning!
Hello!
Good Morning!
Welcome!
Hello!
Hello!
Welcome!
Hello!
Welcome!
Hello!
Hello!
Welcome!
Welcome!
Welcome!
Welcome!

--------------[END-OF-OUTPUT]--------------

*/
