package LeetCode;

public class LeetCode513 {
    private static int maxLevel;
    private static int value;
    public int findBottomLeftValue(TreeNode root) {
        maxLevel = 0;
        value = 0;
        recurse(root, 1);
        return value;
    }

    private void recurse(TreeNode root, int level){
        if (level > maxLevel){
            maxLevel = level;
            value = root.val;
        }
        if (root.left != null){
            recurse(root.left, level+1);
        }
        if (root.right != null){
            recurse(root.right, level+1);
        }
    }
}


