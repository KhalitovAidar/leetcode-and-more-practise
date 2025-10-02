package arrays.sorts;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    private static final Random random = new Random();

    static void main() {
        int[] arr = new int[]{10, 80, 30, 90, 40, 50, 70};
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = random.nextInt(low, high + 1);

            int finalPivotIndex = partition(arr, low, high, pivotIndex);

            quickSort(arr, low, finalPivotIndex - 1);
            quickSort(arr, finalPivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high, int pivotIndex) {
        swapElements(arr, pivotIndex, high);

        // Pointer for small group
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= arr[high]) {
                i++;
                swapElements(arr, i, j);
            }
        }

        swapElements(arr, i + 1, high);

        return i + 1;
    }

    private static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}