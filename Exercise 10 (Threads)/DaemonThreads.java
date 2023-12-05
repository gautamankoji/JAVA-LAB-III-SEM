/* 10(c). Write a Program illustrating Daemon Threads. */

/* AUTHOR
 * Gautam Ankoji
 * Tuesday 05-12-2023 16:51:46
 */

class A extends Thread {
  public void run() {
    if (Thread.currentThread().isDaemon()) System.out.println(
      "daemon thread work"
    ); else System.out.println("user thread work");
  }
}

class DaemonThreads {
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new A();
    A a3 = new A();
    a2.setDaemon(true);
    a1.start();
    a2.start();
    a3.start();
  }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

user thread work
daemon thread work
user thread work

--------------[END-OF-OUTPUT]--------------

*/

