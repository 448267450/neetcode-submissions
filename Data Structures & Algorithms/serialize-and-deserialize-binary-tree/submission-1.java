public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "N";
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    private int idx = 0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] vals = data.split(",");
        idx = 0;
        return helper(vals);
    }
    
    private TreeNode helper(String[] vals) {
        if (vals[idx].equals("N")) {
            idx++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(vals[idx]));
        idx++;
        node.left = helper(vals);
        node.right = helper(vals);
        return node;
    }
}