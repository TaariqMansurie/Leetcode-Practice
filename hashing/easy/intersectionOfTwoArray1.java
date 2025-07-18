package hashing.easy;
import java.util.* ;

public class intersectionOfTwoArray1 {
    public static int[] intersection(int[] nums1, int[]nums2){
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        //for interesection
        for(int i=0; i<nums1.length; i++){
            hs.add(nums1[i]);
        }

        System.out.print("[");
        for(int j=0; j<nums2.length; j++){
            if(hs.contains(nums2[j])){
                resultList.add(nums2[j]);
                System.out.print(nums2[j] + " ");
                hs.remove(nums2[j]);
            }
        }
        System.out.print("]");

        //now converting result array list to array
        int result[] = new int[resultList.size()];
        for(int i=0; i<resultList.size();i++){
            result[i] = resultList.get(i);
        }

        return result;
    }   
    
    public static void main(String[] args) {
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        System.out.println("First array is: "+Arrays.toString(nums1));
        System.out.println("Second array is: "+Arrays.toString(nums2));
        intersection(nums1, nums2);
        // System.out.println("THe intere3section of two arrays is: " + intersection(nums1, nums2));
    }
}


