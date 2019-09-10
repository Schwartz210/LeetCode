package LeetCode;

class LeetCode404 {
    private int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        recursive(root);
        return sum;
    }

    private void recursive(TreeNode node){
        if (node == null){
            return;
        }
        if (node.left != null){
            if (node.left.left == null && node.left.right == null){
                sum += node.left.val;
            }
            recursive(node.left);
        }
        if (node.right != null){
            recursive(node.right);
        }
    }
}