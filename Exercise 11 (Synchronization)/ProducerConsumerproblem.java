/* 11(a). Write a JAVA program for Producer Consumer Problem */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 05-12-2023 17:17:44 
*/

class A {
    int n;
    boolean b = false;
    synchronized int get() {
        if (!b) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Got:" + n);
            b = false;
            notify();
            return n;
        }
        return 0;
    }
    synchronized void put(int n) {
        if (b) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.n = n;
        b = true;
        System.out.println("Put:" + n);
        notify();
    }
}

class Producer implements Runnable {
    A a1;
    Thread t1;
    Producer(A a1) {
        this.a1 = a1;
        t1 = new Thread(this);
        t1.start();
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            a1.put(i);
        }
    }
}

class Consumer implements Runnable {
    A a1;
    Thread t1;
    Consumer(A a1) {
        this.a1 = a1;
        t1 = new Thread(this);
        t1.start();
    }
    public void run() {
        for (int j = 1; j <= 10; j++) {
            a1.get();
        }
    }
}

public class ProducerConsumerproblem {
    public static void main(String args[]) {
        A a1 = new A();
        Producer p1 = new Producer(a1);
        Consumer c1 = new Consumer(a1);
    }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

Put:1 
Got:1
Put:2 
Got:2
Put:3 
Got:3
Put:4 
Got:4
Put:5 
Got:5
Put:6 
Got:6
Put:7 
Got:7
Put:8 
Got:8
Put:9 
Got:9
Put:10 
Got:10

--------------[END-OF-OUTPUT]--------------

*/
