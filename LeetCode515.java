package LeetCode;

import java.util.ArrayList;
import java.util.List;

class LeetCode515 {
    private ArrayList<Integer> results;
    public List<Integer> largestValues(TreeNode root) {
        results = new ArrayList<>();
        traversal(root, 1);
        return results;
    }

    private void traversal(TreeNode node, int level){
        if (node == null){
            return;
        }
        if (results.size() < level){
            results.add(node.val);
        } else {
            if (results.get(level-1) < node.val){
                results.set(level-1, node.val);
            }
        }
        if (node.left != null){
            traversal(node.left, level+1);
        }
        if (node.right != null){
            traversal(node.right, level+1);
        }
    }
}