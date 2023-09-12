/* 2.(c) Java program that implements the merge sort algorithm to sort an array of integers */

/* AUTHOR
 * Gautam Ankoji 
 * Tuesday 12-09-2023 16:28:12 
*/

import java.util.Scanner;

public class MergeSortExample {
    public static void main(String[] args) {
        // int[] arr = {23, 2, 1, 3, 9, 7, 6, 45, 32, 2};

        // System.out.println("Original Array:");
        // printArray(arr);

        // mergeSort(arr, 0, arr.length - 1);

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

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        printArray(arr);

        input.close();
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

/*	OUTPUT:

Enter the size of the list: 10
Enter the elements:
23 2 1 3 9 7 6 45 32 29
Sorted array: 1 2 3 6 7 9 23 29 32 45

*/
