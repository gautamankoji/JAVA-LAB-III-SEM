/* 7(a). Write a JAVA program that describes exception handling mechanism */

/* AUTHOR
 * Gautam Ankoji
 * Tuesday 05-12-2023 16:47:52
 */

class ExceptionHandling {
  public static void main(String args[]) {
    try {
      int a = 10, b = 0;
      int c = a / b;
      System.out.println(c);
    } catch (ArithmeticException e) {
      System.out.println(e);
    }
    System.out.println("After the catch statement");
  }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

java.lang.ArithmeticException: / by zero
After the catch statement

--------------[END-OF-OUTPUT]--------------

*/
