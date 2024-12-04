// class Solution {
//     public static int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i<nums.length ; i++){
//             for ( int j = i+1; j<nums.length; j++){
//                 for ( int k = j+1; k<nums.length; k++){
//                     for ( int l = k+1; l<nums.length; l++){
//                         if (nums[i]+ nums[j] + nums[k]+ nums[l] == target){
//                         return new int[] {i,j,k,l};
//                         }
//                     }
//                 }
//             }
//         }
//         return new int[] {} ;
//     }

//     public static void main(String args[]){
//         int nums[] = {1,0,-1,0,-2,2};
//         int target = 0;
//         int[] result = twoSum(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]+ ", " + result[2]+ ", " +result[3]); 
//     }
// }

// TODO: not complete   