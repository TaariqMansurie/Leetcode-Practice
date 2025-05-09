import java.util.Arrays;

// class Solution {
//     public void nextPermutation(int[] nums) {
//         int n = nums.length;
//         int i = n - 2;

//         // Step 1: Find the first decreasing element from the end
//         while (i >= 0 && nums[i] >= nums[i + 1]) {
//             i--;
//         }

//         // Step 2: If such an element is found
//         if (i >= 0) {
//             int j = n - 1;

//             // Find the element just larger than nums[i]
//             while (j >= 0 && nums[j] <= nums[i]) {
//                 j--;
//             }

//             // Swap nums[i] and nums[j]
//             swap(nums, i, j);
//         }

//         // Step 3: Reverse the elements after index i
//         reverse(nums, i + 1, n - 1);
//     }

//     // Helper method to swap two elements in an array
//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     // Helper method to reverse elements in an array between two indices
//     private void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             swap(nums, start, end);
//             start++;
//             end--;
//         }
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         int[] nums1 = {1, 2, 3};
//         sol.nextPermutation(nums1);
//         System.out.println("Output: " + Arrays.toString(nums1)); // Output: [1, 3, 2]

//         int[] nums2 = {3, 2, 1};
//         sol.nextPermutation(nums2);
//         System.out.println("Output: " + Arrays.toString(nums2)); // Output: [1, 2, 3]

//         int[] nums3 = {1, 1, 5};
//         sol.nextPermutation(nums3);
//         System.out.println("Output: " + Arrays.toString(nums3)); // Output: [1, 5, 1]
//     }
// }


class Solution{
    public void nextPermutation(int[] nums) {
        //inmitializing the pivot
        int pivot = -1;

        //finding the pivot elment
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }

        //finding just greater than
        for(int i=nums.length-1; pivot != -1 && i> pivot; i--){
            if(nums[i] > nums[pivot]){
                //swappiong the just great number than pivot with pivot
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        // reversing the array just ahead of pivot
        int start = pivot + 1;
        int end = nums.length - 1;


        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 2};

        Solution sol = new Solution(); // Assuming your logic is in the Solution class
        sol.nextPermutation(nums);

        System.out.print("Next permutation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        } 
    }
}
