package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LeetCode107 {
    List<List<Integer>> values;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        values = new ArrayList<>();
        traverse(root, 1);
        Collections.reverse(values);
        return values;
    }

    private void traverse(TreeNode node, int level){
        if (node == null){
            return;
        }
        if (level > values.size()){
            values.add(new ArrayList<>());
        }
        values.get(level-1).add(node.val);
        if (node.left != null){
            traverse(node.left, level+1);
        }
        if (node.right != null){
            traverse(node.right, level+1);
        }
    }
}