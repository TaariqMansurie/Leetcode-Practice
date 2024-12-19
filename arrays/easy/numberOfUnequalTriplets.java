class Solution {
    public static int unequalTriplets(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Iterate over all possible triplets (i, j, k)
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check if nums[i], nums[j], nums[k] are pairwise distinct
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 4, 2, 4, 3};
        int result1 = unequalTriplets(nums1);
        System.out.println("Output: " + result1); // Output: 3

        int[] nums2 = {1, 1, 1, 1, 1};
        int result2 = unequalTriplets(nums2);
        System.out.println("Output: " + result2); // Output: 0

        int[] nums3 = {1, 2, 3, 4};
        int result3 = unequalTriplets(nums3);
        System.out.println("Output: " + result3); // Output: 4
    }
}
