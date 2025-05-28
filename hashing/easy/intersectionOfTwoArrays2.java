package hashing.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class intersectionOfTwoArrays2 {

    public static int[] commonElement(int nums1[], int nums2[]){
        //here since we have to keep track of frequency of each no as well we will use a hashmap instead of a hashset
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        //counting occurences of elements in nums1 array and adding them to the ahshmap
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //check against nums2 and add to tghe array list if present in the map(i.e. common elements from nums1)
        for(int num: nums2){
            if(map.containsKey(num) && map.get(num) > 0){ //if map (nums1) and n
                resultList.add(num);
                map.put(num, map.get(num)-1); //decrease the count after using
            }
        }

        //converting result list ot array
        int result[] = new int[resultList.size()];
        for(int i=0; i< resultList.size(); i++){
            result[i] = resultList.get(i);
        }

        return result;
}

public static void main(String[] args) {
    int nums1[] = {1,2,2,1};
    int nums2[] = {2,2};
    int output[] = commonElement(nums1,nums2);
    System.out.println("The intersection of two arrays is : "+Arrays.toString(output));
    }
}