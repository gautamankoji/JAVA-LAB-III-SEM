/* Java program that display the roots of a quadratic equation */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 12-09-2023 14:31:29 
*/

import java.util.Scanner;

class QuadraticRoots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Given Quadratuc Equation: ax² + bx + c = 0");
        System.out.println("Enter the coefficients a, b and c:");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = b*b - 4*a*c;

        System.out.println("Discriminant(D) = " + discriminant);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two Distinct Real roots:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are Real and Equal:");
            System.out.println("Root: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Complex/Imaginary Roots:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

        input.close();
    }
}

/*  OUTPUT

Given Quadratuc Equation: ax² + bx + c = 0
Enter the coefficients a, b and c: 1 2 1
Discriminant(D) = 0.0
Roots are Real and Equal:
Root: -1.0

*/  