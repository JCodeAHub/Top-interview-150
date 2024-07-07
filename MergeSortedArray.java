public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1, nums2, and the merged array
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerged = m + n - 1;

        // Traverse from the end of nums1 and nums2
        while (p1 >= 0 && p2 >= 0) {
            // Compare and place the larger element at the end of nums1
            if (nums1[p1] > nums2[p2]) {
                nums1[pMerged] = nums1[p1];
                p1--;
            } else {
                nums1[pMerged] = nums2[p2];
                p2--;
            }
            pMerged--;
        }

        // Copy remaining elements of nums2 if any
        while (p2 >= 0) {
            nums1[pMerged] = nums2[p2];
            pMerged--;
            p2--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
