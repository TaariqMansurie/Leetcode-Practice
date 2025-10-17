package trees.BST;

class Solution {
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
    public boolean isValidBST(TreeNode root) {

        return validate(root,null, null);
    }
    public boolean validate(TreeNode root, TreeNode min, TreeNode max){

        if(root == null) return true;

        if(min != null && root.val <= min.val){
            return false;
        }
        if(max!= null && root.val >= max.val){
            return false;
        }

        return validate(root.left, min, root) && validate(root.right, root, max);
    }

     public static TreeNode insert(TreeNode root, int vals){
        if(root == null){
            root = new TreeNode(vals);
            return root;
        }
        if(root.val > vals){
            root.left = insert(root.left, vals);
        } else {
            root.right = insert(root.right, vals);
        }
        return root;
    }
    
    public static void inorder(TreeNode root){
        if(root == null) return ;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

 
    public static void main(String[] args) {
        // int values[] = {8,5,3,1,4,6,10,11,14};
        int values[] = {8,5,3,6,10,11,14};
        // int values[] = {1,3,4,5,6,7};
        TreeNode root = null;

        for(int i=0 ; i< values.length; i++){
            root = insert(root, values[i]);
        }
        // now check whether its inorder sequence is correct or not
        inorder(root);
        System.out.println();

        // root = delete(root, 5);
        // System.out.println();
        // printInRangeOfK(root, 5, 12);
        // rootToLeaf(root, new ArrayList<>());

        if(isValidBST(root, null, null)){
            System.out.println("BST is valid");
        } else {
            System.out.println("BST is not valid");
        }
    }
}