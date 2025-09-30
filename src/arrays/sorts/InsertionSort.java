package arrays.sorts;

import java.util.Arrays;

public class InsertionSort {
    static void main() {
        sort(new int[]{5, 1 ,2, 10 ,4, 6, 6, 6, 3, 12});
    }

    public static void sort(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            int current = mass[i];
            int j = i - 1;

            while (j >= 0 && mass[j] > current) {
                mass[j + 1] = mass[j];
                j --;
            }

            mass[j + 1] = current;
        }
        System.out.println(Arrays.toString(mass));
    }
}
