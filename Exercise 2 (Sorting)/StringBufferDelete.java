/* 2.(d) Java program that uses a `StringBuffer` to delete or remove characters from a given string */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 12-09-2023 16:49:20 
*/

import java.util.Scanner;

public class StringBufferDelete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        // String inputString = "Java Programming";

        StringBuffer stringBuffer = new StringBuffer(inputString);

        System.out.print("Enter the character to remove: ");
        char charToRemove = input.next().charAt(0);

        deleteCharacter(stringBuffer, charToRemove);

        System.out.println("Resulting string after removing '" + charToRemove + "':");
        System.out.println(stringBuffer.toString());

        input.close();
    }

    public static void deleteCharacter(StringBuffer stringBuffer, char charToRemove) {
        int index = 0;
        while ((index = stringBuffer.indexOf(String.valueOf(charToRemove))) != -1) {
            stringBuffer.deleteCharAt(index);
        }
    }
}

/*	OUTPUT:

Enter a string: Java Programming
Enter the character to remove: a
Resulting string after removing 'a': Jv Progrmming

*/
