package arrays.sorts;

import java.util.Arrays;

public class MergeSort {
    static void main() {
        int[] arr = new int[]{5, 1 ,2, 10 ,4, 6, 6, 6, 3, 12};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;

        if(n == 1) return;

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, n - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;

        // Pointers to merge
        int i = 0;
        int j = 0;
        int arrI = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i] < right[j]) {
                arr[arrI++] = left[i++];
            }
            else {
                arr[arrI++] = right[j++];
            }
        }

        if (i < leftLength) {
            while (i < leftLength) {
                arr[arrI++] = left[i++];
            }
        }

        if (j < rightLength) {
            while (j < rightLength) {
                arr[arrI++] = right[j++];
            }
        }
    }
}
