class Solution {
    // public static int[] twoSum(int[] nums, int target) {
    //     for (int i = 0; i<nums.length ; i++){
    //         for ( int j = i+1; j<nums.length; j++){
    //             if (nums[i]+ nums[j] == target){
    //                 return new int[] {i,j};
    //             }
    //         }
    //     }
    //     return new int[] {} ;
    // }
    //brute force solution
    public static int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String args[]){
        int nums[] = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // result [0 & 1] because it only contains i and j as elements that add up to the target, that's why it is just [0 & 1].
    }
}