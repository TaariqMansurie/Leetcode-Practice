public class ContinuousSubarrays {
    public static void subArrays(int nums[]){
        int totalSubArray = 0;
        int maxSubArraySum = Integer.MIN_VALUE;
        int minSubArraySum = Integer.MAX_VALUE;
        // int currSum = 0;
        //for getting the start
        for(int i=0; i<nums.length; i++){
            int currSum = 0;
            int start = i;
            //for getting the end
            for (int j=i; j<nums.length; j++){
                int end = j;
                currSum += nums[j];

                for(int k = start; k<=end; k++){
                    System.out.print(nums[k] + " "); // printing subarray elements
                    //write logic for calculating sum of each elements of k( basically each subarray)
                    // currSum += nums[k];
                }
                System.out.println("The sum of this subarray is : " +currSum);
                totalSubArray ++;

                // Update max and min subarray sums
                maxSubArraySum = Math.max(maxSubArraySum, currSum);
                minSubArraySum = Math.min(minSubArraySum, currSum);
            }
            // currSum = 0; //resetting the subarray sum to 0 after every time start changes and increments to the next number
            System.out.println();
        }
        System.out.println("total subarrays = "+totalSubArray);
        System.out.println("The maximum subarray sum is : "+maxSubArraySum);
        System.out.println("The minimum subarray sum is : "+minSubArraySum);
    }
    
    public static void main(String[] args) {
        int [] nums = {4,2,6,8,10};
        subArrays(nums);
    }
}