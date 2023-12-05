/* 9(a). Write a JAVA program for creation of Illustrating throw */

/* AUTHOR
 * Gautam Ankoji
 * Tuesday 05-12-2023 16:48:53
 */

class ThrowKeyword {
  public static void main(String args[]) {
    try {
      throw new NullPointerException("demo");
    } catch (NullPointerException e) {
      System.out.println(e);
    }
  }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

java.lang.NullPointerException: demo

--------------[END-OF-OUTPUT]--------------

*/
