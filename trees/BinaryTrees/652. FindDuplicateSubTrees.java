package trees.BinaryTrees;

import java.util.*; 



public class FindDuplicateSubTrees{

    static class TreeNode {
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

    static Map<String,Integer> count;
    static List<TreeNode> result;

    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        count = new HashMap<>();
        result = new ArrayList<>();
        serialize(root);
        return result;
    }

    public static String serialize(TreeNode root){
        if(root == null) return "#";

        String serial = root.val + "," + serialize(root.left) + "," + serialize(root.right);

        count.put(serial, count.getOrDefault(serial, 0) + 1);

        if(count.get(serial) == 2) {
            result.add(root);
        }

        return serial;
    }

    // Helper to print results
    public static void printResults(List<TreeNode> res) {
        for (TreeNode node : res) {
            System.out.println("Duplicate subtree root: " + node.val);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.left.left = new TreeNode(4);
        root.right.right = new TreeNode(4);

        List<TreeNode> duplicates = findDuplicateSubtrees(root);
        printResults(duplicates);
    }
}