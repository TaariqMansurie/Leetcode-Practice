// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] result = new int[2];
//         result[0] = findFirstPosition(nums, target);
//         result[1] = findLastPosition(nums, target);
//         return result;
//     }

//     private int findFirstPosition(int[] nums, int target) {
//         int left = 0, right = nums.length - 1;
//         int firstPosition = -1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (nums[mid] == target) {
//                 firstPosition = mid;
//                 right = mid - 1; // Keep searching on the left side
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return firstPosition;
//     }

//     private int findLastPosition(int[] nums, int target) {
//         int left = 0, right = nums.length - 1;
//         int lastPosition = -1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (nums[mid] == target) {
//                 lastPosition = mid;
//                 left = mid + 1; // Keep searching on the right side
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return lastPosition;
//     }

//     // Main method to test the solution
//     public static void main(String[] args) {
//         Solution solution = new Solution();

//         // Test case 1
//         int[] nums1 = {5, 7, 7, 8, 8, 10};
//         int target1 = 8;
//         int[] result1 = solution.searchRange(nums1, target1);
//         System.out.println("Test 1: [" + result1[0] + ", " + result1[1] + "]"); // Output: [3, 4]

//         // Test case 2
//         int[] nums2 = {5, 7, 7, 8, 8, 10};
//         int target2 = 6;
//         int[] result2 = solution.searchRange(nums2, target2);
//         System.out.println("Test 2: [" + result2[0] + ", " + result2[1] + "]"); // Output: [-1, -1]

//         // Test case 3
//         int[] nums3 = {};
//         int target3 = 0;
//         int[] result3 = solution.searchRange(nums3, target3);
//         System.out.println("Test 3: [" + result3[0] + ", " + result3[1] + "]"); // Output: [-1, -1]

//         // Test case 4
//         int[] nums4 = {1};
//         int target4 = 1;
//         int[] result4 = solution.searchRange(nums4, target4);
//         System.out.println("Test 4: [" + result4[0] + ", " + result4[1] + "]"); // Output: [0, 0]
//     }
// }


class Solution {
    public static int[] searchRange(int[] nums, int target){
        int[] result = new int[2];
        result[0] = findFirstPosition(nums, target);
        result[1] = findLastPosition(nums,target);
        return result;
    }

    public static int findFirstPosition(int[] nums,int target){
        int l = 0; int r = nums.length-1;
        int firstPosition = -1;

        while(l<=r){
            int m = l + (r-l)/2;
            if (nums[m] == target ){
                firstPosition = m;
                r = m - 1; // not left because we' re directly checking if mid == target or not
            }
            else if (nums[m] < target) {
                l = m + 1; // moving left to right 1 unit(position) from mid since there is no target found until now
            }
            else {
                r = m -1; // moving right to left 1 unit (position) from mid since already we found one position of target out of 2.. there might be the same target on the left
            }
        }
        return firstPosition;
    }

    public static int findLastPosition(int[] nums, int target){
        int l = 0; int r = nums.length-1;
        int lastPosition = -1;

        while(l<=r){
            int m = l + (r-l)/2;
            if (nums[m] == target ){
                lastPosition = m ;
                l = m + 1;
            }
            else if (nums[m] < target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return lastPosition;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);
        System.out.println("Test 1: [" + result[0] + ", " + result[1] + "]"); // Output: [3, 4]

        // // Test case 2
        // int[] nums2 = {5, 7, 7, 8, 8, 10};
        // int target2 = 6;
        // int[] result2 = solution.searchRange(nums2, target2);
        // System.out.println("Test 2: [" + result2[0] + ", " + result2[1] + "]"); // Output: [-1, -1]

        // // Test case 3
        // int[] nums3 = {};
        // int target3 = 0;
        // int[] result3 = solution.searchRange(nums3, target3);
        // System.out.println("Test 3: [" + result3[0] + ", " + result3[1] + "]"); // Output: [-1, -1]

        // // Test case 4
        // int[] nums4 = {1};
        // int target4 = 1;
        // int[] result4 = solution.searchRange(nums4, target4);
        // System.out.println("Test 4: [" + result4[0] + ", " + result4[1] + "]"); // Output: [0, 0]
    }
}