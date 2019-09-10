package LeetCode;

import java.util.ArrayList;

public class LeetCode129 {
    private ArrayList<String> paths = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        recurse(root, "");
        for (String p:paths){
            sum += Integer.parseInt(p);
        }
        return sum;
    }

    private void recurse(TreeNode root, String path){
        if (root == null){
            return;
        }
        path += root.val;
        if (root.left == null && root.right == null){
            paths.add(path);
        }
        if (root.left != null){
            recurse(root.left, path);
        }
        if (root.right != null){
            recurse(root.right, path);
        }
    }
}
