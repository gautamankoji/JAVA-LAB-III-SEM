/* 9(b). Write a JAVA program for creation of Illustrating finally */

/* AUTHOR
 * Gautam Ankoji
 * Tuesday 05-12-2023 16:49:11
 */

class FinallyKeyword {
  public static void main(String args[]) {
    try {
      int a = 10, b = 0;
      int c = a / b;
      System.out.println(c);
    } catch (ArithmeticException e) {
      System.out.println(e);
    } finally {
      System.out.println("This is inside finally block");
    }
  }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

java.lang.ArithmeticException: / by zero
This is inside finally block

--------------[END-OF-OUTPUT]--------------

*/
