class Solution {
    public void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1 and nums2
        int p1 = m - 1; // Last valid element in nums1
        int p2 = n - 1; // Last element in nums2

        // Pointer for the end of the merged array
        int p = m + n - 1;

        // Merge nums1 and nums2 from the end
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2, copy them
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }

        // No need to handle remaining elements in nums1; they are already in place
    }

    public static void main(String[] args) {
        // Example input
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        // Create an instance of the Solution class
        Solution solution = new Solution();
        solution.mergeSortedArray(nums1, m, nums2, n);

        // Print the result
        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
