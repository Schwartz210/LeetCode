package LeetCode;

import java.util.ArrayList;
import java.util.List;

class LeetCode102 {
    private List<List<Integer>> values;
    public List<List<Integer>> levelOrder(TreeNode root) {
        values = new ArrayList<>();
        traversal(root, 1);
        return values;
    }

    private void traversal(TreeNode node, int level){
        if (node == null){
            return;
        }
        if (level > values.size()){
            values.add(new ArrayList<>());
        }
        values.get(level-1).add(node.val);
        if (node.left != null){
            traversal(node.left, level+1);
        }
        if (node.right != null){
            traversal(node.right, level+1);
        }
    }
}