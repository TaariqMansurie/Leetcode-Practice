public class searchInRotatedSortedArray {
    public static int searchInRotatedSortedArray(int nums[], int target){

        //searchign pivot index through binary search first
        int pivot = pivotSearch(nums);

        //finding the target in left sorted array
        if(nums[pivot] <= target && target <= nums[nums.length-1]){
            return search(nums, pivot, nums.length-1, target); //will search ion right part of array
        }

        //finding the tarfet in righgt sorted array
        else {
            return search(nums,0,pivot,target); // will search in left part of array
        }
    }

    public static int pivotSearch(int nums[]){
        int left = 0;
        int right = nums.length-1;

        while(left < right){ //ye tab tak karenge jab tak left rightr ke equal nahi hojata ya pivot index nahi mil jata tab tak
            int mid = left + (right-left)/2;
            if(mid >0 && nums[mid-1] > nums[mid]){
                return mid;
            }
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return left; // when only 1 value is left, thats our right, elft , target,mid so thats why returning it
    }
    
    //binary search to find target in left to right boundary
    public static int search(int[] nums, int left, int right, int target){
        int l = left;
        int r = right;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1;
    }

    

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,1,2,3};
        int pos = searchInRotatedSortedArray(nums,2);
        System.out.println(pos);
    }
}
