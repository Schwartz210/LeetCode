package LeetCode;

class LeetCode104 {
    int maxLevel;
    public int maxDepth(TreeNode root) {
        maxLevel = 0;
        traversal(root, 1);
        return maxLevel;
    }

    private void traversal(TreeNode node, int level){
        if (node == null){
            return;
        }
        if (level > maxLevel){
            maxLevel = level;
        }
        if (node.left != null){
            traversal(node.left, level+1);
        }
        if (node.right != null){
            traversal(node.right, level+1);
        }
    }
}