package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

class LeetCode671 {
    private HashSet<Integer> set;
    public int findSecondMinimumValue(TreeNode root) {
        set = new HashSet<>();
        recurse(root);
        Object[] list = set.toArray();
        Arrays.sort(list);
        if (list.length < 2){
            return -1;
        } else {
            return (int) list[1];
        }
    }

    private void recurse(TreeNode node){
        if (node == null){
            return;
        }
        set.add(node.val);
        if (node.left != null){
            recurse(node.left);
        }

        if (node.right != null){
            recurse((node.right));
        }
    }
}