class Solution {
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right) {
            //calculating the current area
            int width = right - left;
            int minHeight = Math.min(height[left],height[right]);
            int currentArea = width * minHeight;

            //updating the maxa area by comparing the areas of two
            maxArea = Math.max(maxArea,currentArea);

            if(height[left] < height[right]){
                left ++;
            } else {
                right --;
            }
        }

        return maxArea;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area: " + solution.maxArea(height1)); // Output: 49
        
        int[] height2 = {1, 1};
        System.out.println("Max Area: " + solution.maxArea(height2)); // Output: 1
    }
}
