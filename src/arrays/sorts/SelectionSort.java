package arrays.sorts;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        sort(new int[]{5, 1 ,2, 10 ,4, 6, 6, 6, 3, 12});
    }

    public static void sort(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < mass.length; j++) {
                if (mass[j] < mass[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = mass[i];
                mass[i] = mass[minIndex];
                mass[minIndex] = temp;
            }
        }

        System.out.println(Arrays.toString(mass));
    }
}
