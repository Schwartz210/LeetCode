package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

class LeetCode230 {
    ArrayList<Integer> values;
    public int kthSmallest(TreeNode root, int k) {
        values = new ArrayList<>();
        traverse(root);
        Collections.sort(values);
        return values.get(k-1);
    }

    private void traverse(TreeNode node){
        if (node == null){
            return;
        }
        values.add(node.val);
        if (node.left != null){
            traverse(node.left);
        }
        if (node.right != null){
            traverse(node.right);
        }
    }
}