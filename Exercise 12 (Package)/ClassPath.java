/* 12(a). Write a JAVA program illustrates class path */

/* AUTHOR
 * Gautam Ankoji
 * Tuesday 05-12-2023 16:53:18
 */

import java.net.URL;
import java.net.URLClassLoader;

public class ClassPath {
  public static void main(String[] args) {
    ClassLoader sysClassLoader = ClassLoader.getSystemClassLoader();
    URL[] urls = ((URLClassLoader) sysClassLoader).getURLs();
    for (int i = 0; i < urls.length; i++) {
      System.out.println(urls[i].getFile());
    }
  }
}

/*	OUTPUT:

------------------[OUTPUT]-----------------

E:/java%20work/

--------------[END-OF-OUTPUT]--------------

*/
