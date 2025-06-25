class Solution {
    //using kadane's algorithm
    // public static int maxSubArray(int[] nums) {
    //     int maxSum = Integer.MIN_VALUE;
    //     int currSum = 0;

    //     for (int i=0; i<nums.length; i++){
    //         currSum = currSum + nums[i];

    //         if (currSum > maxSum){
    //             maxSum = currSum;
    //         }

    //         if (currSum < 0){
    //             currSum = 0;
    //         }
    //         // maxSum = Math.max(currSum,maxSum);
    //     }
    //     System.out.println("The max sub array sum is:" +maxSum);

    //     return maxSum;
    // }

    //prefix sum
    // public static void maxSubArray(int[] nums){
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[nums.length];
    //     prefix[0] = nums[0];
    //     //calculating prefix array
    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + nums[i];
    //     }

    //     for(int i=0; i<nums.length; i++){
    //         int start = i;
    //         for(int j=i; j<nums.length; j++){
    //             int end = j;
    //             // currSum = 0;
    //             // for(int k= start; k<=end;k++){
    //             //     //subarray sum
    //             //     currSum += nums[k];
    //             // }
    //             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
    //             // System.out.println(currSum);
    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println("max sum = " +maxSum);
    // }

    //loop iteration

        

    public static void main(String args[]){
        // int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int nums[] = {1,-2,6,-1,3};
        maxSubArray(nums);
    }
}