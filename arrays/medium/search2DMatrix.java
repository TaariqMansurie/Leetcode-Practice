class Solution {
    // public boolean searchMatrix(int[][] matrix, int target) {
    //     if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    //         return false;
    //     }
        
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     int left = 0, right = m * n - 1;
        
    //     while (left <= right) {
    //         int mid = left + (right - left) / 2;
    //         int row = mid / n;
    //         int col = mid % n;
    //         int midValue = matrix[row][col];
            
    //         if (midValue == target) {
    //             return true;
    //         } else if (midValue < target) {
    //             left = mid + 1;
    //         } else {
    //             right = mid - 1;
    //         }
    //     }
        
    //     return false;
    // }

    public static boolean staircaseSearch(int matrix[][], int key){
        // int row = 0, col = matrix[0].length-1;
        // while(row < matrix.length && col >= 0 ){  //time complexity depends upon if m is bigger or n is bigger
        //     if(matrix[row][col] == key){
        //         System.out.println("found key at (" + row + "," +col+ ")");
        //         return true;
        //     }
        //     else if(key<matrix[row][col]){
        //         col--; // moving leftwards
        //     }
        //     else {
        //         row ++; //moving downwards
        //     }
        // }

        int row = matrix.length-1 , col = 0;
        while(row >=0 && col < matrix[0].length ){  //time complexity depends upon if m is bigger or n is bigger
            if(matrix[row][col] == key){
                System.out.println("found key at (" + row + "," +col+ ")");
                return true;
            }
            else if(key < matrix[row][col]){
                row --; // moving leftwards
            }
            else {
                col ++; //moving downwards
            }
        }

        System.out.println("key not found");
        return false ;
    }
    
    public static void main(String[] args) {
        // Solution solution = new Solution();
        // int[][] matrix = {
        //     {1, 3, 5, 7},
        //     {10, 11, 16, 20},
        //     {23, 30, 34, 60}
        // };
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        // int target = 3;
        // System.out.println(solution.searchMatrix(matrix, target)); // Output: true
        
        // target = 13;
        // System.out.println(solution.searchMatrix(matrix, target)); // Output: false

        int key = 30;
        staircaseSearch(matrix, key);
    }
}
