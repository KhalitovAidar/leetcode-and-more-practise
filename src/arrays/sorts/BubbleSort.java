package arrays.sorts;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        sort(new int[]{5, 1 ,2, 10 ,4, 6, 6, 6, 3, 12});
    }

    private static void sort(int[] mass) {
        int temp;
        for (int i = 0; i < mass.length; ++i) {
            for (int j = 0; j < mass.length - i - 1; ++j) {
                if (mass[j] > mass[j + 1]) {
                    temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
