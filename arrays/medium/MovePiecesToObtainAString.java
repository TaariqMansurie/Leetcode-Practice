class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        int i = 0; // Pointer for start
        int j = 0; // Pointer for target

        while (i < n || j < n) {
            // Move i to the next non-'_' character
            while (i < n && start.charAt(i) == '_') {
                i++;
            }
            // Move j to the next non-'_' character
            while (j < n && target.charAt(j) == '_') {
                j++;
            }

            // If both pointers are out of bounds, we are done
            if (i == n && j == n) {
                return true;
            }
            // If one pointer is out of bounds but not the other, return false
            if (i == n || j == n) {
                return false;
            }

            // Check if characters at i and j match
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            }

            // Movement constraints
            if (start.charAt(i) == 'L' && i < j) {
                return false; // 'L' cannot move to the right
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false; // 'R' cannot move to the left
            }

            // Move both pointers to the next positions
            i++;
            j++;
        }

        return true; // All checks passed
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        String start1 = "_L__R__R_";
        String target1 = "L______RR";
        System.out.println("Test 1: " + solution.canChange(start1, target1)); // Output: true

        // Test case 2
        String start2 = "R_L_";
        String target2 = "__LR";
        System.out.println("Test 2: " + solution.canChange(start2, target2)); // Output: false

        // Test case 3
        String start3 = "_R";
        String target3 = "R_";
        System.out.println("Test 3: " + solution.canChange(start3, target3)); // Output: false

        // Test case 4
        String start4 = "L__R";
        String target4 = "L__R";
        System.out.println("Test 4: " + solution.canChange(start4, target4)); // Output: true

        // Test case 5
        String start5 = "L__R_LR__";
        String target5 = "LL__RR___";
        System.out.println("Test 5: " + solution.canChange(start5, target5)); // Output: false
    }
}
