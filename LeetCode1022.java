package LeetCode;

import java.util.ArrayList;
// success
public class LeetCode1022 {
    private ArrayList<String> paths = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        if (root == null){
            return 0;
        }
        recurse(root, "");
        int sum = 0;
        for (String p:paths){
            sum += Integer.parseInt(p, 2);
        }
        return sum;
    }
    private void recurse(TreeNode root, String path){
        path += root.val;
        if (root.left == null && root.right == null){
            paths.add(path);
        } else {
            if (root.left != null){
                recurse(root.left, path);
            }
            if (root.right != null){
                recurse(root.right, path);
            }
        }
    }
}
