public class findPeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0; // this will be there if we don't check for first elmeent and last elmeent
        int n = nums.length;
        int right = n - 1;
        // int left = 1;
        // int right = n-2;

        // if(n == 1) {
        //     return 0;
        // }
        // if(nums[0] > nums[1]) {
        //     return 1;
        // }
        // if(nums[n-1] > nums[n-2]){
        //     return n-1;
        // }
        while(left < right){
            int mid = left + (right - left) / 2; // to avoid overflow conditions

            //reduce the search space -- search in the right part of the mid
            if(nums[mid] < nums[mid+1]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,1};
        System.out.println(findPeakElement(nums));
    }
}
