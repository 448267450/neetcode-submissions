class Solution {

    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        int left_length = 1 + maxDepth(root.left);
        int right_length = 1 + maxDepth(root.right);

        return Math.max(left_length, right_length);
    }
}
