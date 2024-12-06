// public class SingleNumber {
    
// }

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0; //since XOR with 0 returns same number
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];        // result = (result) XOR (array element at i) 
        }
        return result; 
    }
}