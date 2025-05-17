public class searchInRotatedSortedArray2 { // for distinct elmeents
    //tc : O(logN + O(N/2))
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1 ;
        boolean ans = false; // since boolean has to be returned
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target == nums[mid]){
                return true;
            }
            // if start, midd and end are all the same then we can't guarantee which 
            //part is sorted so we will trim down the space
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start ++;
                end --;
            }
            //if left side is sorted
            else if(nums[start] <= nums[mid]) {
                //can ans found in left side ?
                if(nums[start] <= target && target < nums[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } // right side is sorted
            else {
                //can ans be found in the right side?
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {19,2,19,19,19,19};
        int target = 2;
        System.out.println("The following target: " +target+" lies in nums array: "+nums.toString()+ " ::" +search(nums,target));
    }
}
