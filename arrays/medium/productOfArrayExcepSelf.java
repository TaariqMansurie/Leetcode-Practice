import java.util.Arrays;

public class productOfArrayExcepSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n]; // array which will store the output
        int ProdL = 1; // to find prod of elements on left
        int ProdR = 1; // to find prod of elements on right

        //prod of elements on right
        for(int i=n-1; i>=0; i--){
            ans[i] = ProdR;
            ProdR = ProdR*nums[i];
        }

        //prod of elements on left
        for(int i=0; i<n; i++){
            ans[i] = ans[i] * ProdL;
            ProdL = ProdL * nums[i];
        }

        return ans;
    }

    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));

        int nums2[] = {4,5,6,7,8};
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }
}

