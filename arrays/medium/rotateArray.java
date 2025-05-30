// 189. Rotate Array
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Example 2:

// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]
 

// Constraints:

// 1 <= nums.length <= 105
// -231 <= nums[i] <= 231 - 1
// 0 <= k <= 105
 

// Follow up:

// Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
// Could you do it in-place with O(1) extra space?
// https://leetcode.com/problems/rotate-array/description/?envType=problem-list-v2&envId=array


import java.util.*;
class Solution {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; //if k > nums.length then it will be k = k % nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        System.out.println("The rotated array in k steps is: "+Arrays.toString(nums));
    }

    public static void reverse(int nums[], int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
}

