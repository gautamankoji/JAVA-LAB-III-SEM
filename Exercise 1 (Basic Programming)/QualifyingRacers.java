/* 1.(c) Java program to take input for the speeds of five bikers, calculate the average speed, and then determine and display the speeds of the qualifying racers */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 12-09-2023 15:03:12 
*/

import java.util.Scanner;

class QualifyingRacers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] speeds = new double[5];
        double totalSpeed = 0;

        System.out.println("Enter the speeds of 5 racers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Racer " + (i + 1) + ": ");
            speeds[i] = input.nextDouble();
            totalSpeed += speeds[i];
        }

        double averageSpeed = totalSpeed / 5;

        System.out.println("Qualifying Racers (speed > average speed):");
        for (int i = 0; i < 5; i++) {
            if (speeds[i] > averageSpeed) {
                System.out.println("Racer " + (i + 1) + ": " + speeds[i]);
            }
        }

        input.close();
    }
}

/*  OUTPUT:

Enter the speeds of 5 racers:
Racer 1:
128
Racer 2: 138
Racer 3: 139
Racer 4: 129
Racer 5: 130
Qualifying Racers (speed > average speed):
Racer 2: 138.0
Racer 3: 139.0

*/