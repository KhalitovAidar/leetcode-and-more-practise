import java.util.Arrays;

public class Main {
    public static void main() {
        findMedianSortedArrays(
                new int[] {1, 3, 4 ,5 ,7, 10},
                new int[] {2, 3 ,4 ,5 ,7}
        );
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i=0, j=0, k=0;

        while(i < nums1.length && j < nums2.length) {
            System.out.printf("Els %d %d \n", nums1[i], nums2[j]);
            if (nums1[i] <= nums2[j]) {
                System.out.printf("nums1[i] %d \n", nums1[i]);
                result[k++] = nums1[i++];
            }
            else {
                System.out.printf("nums2[j] %d \n", nums2[j]);
                result[k++] = nums2[j++];
            }
        }

        System.out.println(Arrays.toString(result));
        return 2.5;
    }
}