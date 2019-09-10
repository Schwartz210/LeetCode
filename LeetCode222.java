package LeetCode;

import java.util.HashSet;

public class LeetCode222 {
    private HashSet<TreeNode> nodes = new HashSet<>();
    public int countNodes(TreeNode root) {
        if (root != null){
            recurse(root);
        }
        return nodes.size();
    }

    private void recurse(TreeNode root){
        nodes.add(root);
        if (root.left == null && root.right == null){
            return;
        }
        if (root.left != null){
            recurse(root.left);
        }
        if (root.right != null){
            recurse(root.right);
        }
    }
}
