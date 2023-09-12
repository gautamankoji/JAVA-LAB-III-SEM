import java.util.Scanner;

public class BubbleSortExample {
    public static void main(String[] args) {
        // int[] arr = {23, 2, 1, 3, 9, 7, 6, 45, 32, 2};

        // System.out.println("Original Array:");
        // printArray(arr);

        // bubbleSort(arr);

        // System.out.println("Sorted Array:");
        // printArray(arr);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        bubbleSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);

        input.close();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

/*  OUTPUT:

Enter the size of the list: 10
Enter the elements:
23 2 1 3 9 7 6 45 32 29
Sorted array: 1 2 3 6 7 9 23 29 32 45

*/