package arrays;


public class MedianOfTwoSortedArrays {
    static void main() {
        int[] nums1 = new int[] {1, 2, 3, 3, 4};
        int[] nums2 = new int[] {2};

        System.out.println(searchMedian(nums1, nums2));
    }

    private static float searchMedian(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        // Pointer for nums1
        int i = 0;

        // Pointer for nums2
        int j = 0;

        // Pointer for result massive
        int resPointer = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[resPointer++] = nums1[i++];
            }
            else {
                result[resPointer++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            result[resPointer++] = nums1[i++];
        }

        while (j < nums2.length) {
            result[resPointer++] = nums2[j++];
        }

        return result.length % 2 == 0 ?
               (float) (result[(result.length / 2) - 1] + result[result.length / 2]) / 2 :
               result[result.length / 2];
    }
}
