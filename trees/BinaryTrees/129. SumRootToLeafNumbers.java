package trees.BinaryTrees;


public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
         this.right = right;
  }
}


public class SumRootToLeafNumbers {
    public static int sumNumbers(TreeNode root){
        return dfs(root, 0);
    }
    public static int dfs(TreeNode root, int currSum){
        if(root == null) return 0;

        currSum = currSum * 10 + root.val;

        if(root.left == null && root.right == null){
            return currSum;
        }

        // if not leaf nodes then calculate on left and right
        int leftSum = dfs(root.left, currSum);
        int rightSum = dfs(root.right, currSum);
        
        return currSum;
    }
    public static void main(String args[]){
        // Build example tree: [4,9,0,5,1]
        //     4
        //    / \
        //   9   0
        //  / \
        // 5   1
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1)        ;

        sumNumbers(root);
    }

}
