/* 12(c). Write a JAVA program that import and use the defined your package in the previous Problem. */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 05-12-2023 16:53:47 
*/

// save by A.java 

package pack; 

public class A { 
  public void msg(int a, int b) {
    System.out.println("SUM: " + (a+b));
  } 
}

// save by B.java 

package mypack; 
import pack.A; 

class B { 
  public static void main(String args[]) { 
    A obj = new A();
    int a = 792;
    int b = 3728;
    obj.add(a, b); 
  } 
} 

/*        OUTPUT:

------------------[OUTPUT]-----------------

SUM: 4520

--------------[END-OF-OUTPUT]--------------

*/
