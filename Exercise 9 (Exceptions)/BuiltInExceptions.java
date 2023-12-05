/* 9(c). Write a JAVA program for creation of Java Built-in Exceptions */

/* AUTHOR
 * Gautam Ankoji
 * Tuesday 05-12-2023 16:49:30
 */

class BuiltInExceptions {
  public static void main(String args[]) {
    try {
      int num = Integer.parseInt("akki");
      System.out.println(num);
    } catch (NumberFormatException e) {
      System.out.println(e);
    }
  }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

java.lang.NumberFormatException: For input string: "akki"

--------------[END-OF-OUTPUT]--------------

*/
