package arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] mass = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(solve(mass));
    }

    // solution for complexity n
    private static int solve(int[] mass) {
        // left pointer
        int i = 0;
        // right pointer
        int j = mass.length - 1;
        int maxVolume = 0;
        int currentVolume;

        while (i != j) {
            if (mass[i] > mass[j]) {
                currentVolume = mass[j] * (j - i);
                if (currentVolume > maxVolume) maxVolume = currentVolume;
                j--;
            }
            else {
                currentVolume = mass[i] * (j - i);
                if (currentVolume > maxVolume) maxVolume = currentVolume;
                i++;
            }
        }

        return maxVolume;
    }
}
