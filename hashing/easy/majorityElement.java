package hashing.easy;

import java.util.HashMap;

public class majorityElement {
    
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if(map.get(key) > nums.length / 2){
                // System.out.println(key);
                return key;  
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // majorityElement solution = new majorityElement();
        // int nums[] = {1,3,2,5,1,3,1,5,1};
        // System.out.println(solution.majorityElement(nums));

        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
        
        // // Example 1
        // int[] nums1 = {3, 2, 3};
        // System.out.println("Majority Element: " + solution.majorityElement(nums1)); // Output: 3

        // // Example 2
        // int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        // System.out.println("Majority Element: " + solution.majorityElement(nums2)); // Output: 2
    }
}
//