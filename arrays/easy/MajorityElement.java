class Solution {
    public int majorityElement(int[] nums) {
        // Step 1: Find a candidate for the majority element using Boyer-Moore Voting Algorithm
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Return the candidate
        // Since the problem guarantees a majority element, we don't need to verify.
        return candidate;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {3, 2, 3};
        System.out.println("Majority Element: " + solution.majorityElement(nums1)); // Output: 3

        // Example 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + solution.majorityElement(nums2)); // Output: 2
    }
}