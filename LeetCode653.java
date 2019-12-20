package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

class LeetCode653 {
    ArrayList<Integer> array;
    public boolean findTarget(TreeNode root, int k) {
        array = new ArrayList<>();
        recurse(root);
        Collections.sort(array);
        for (int i=0;i<array.size();i++){
            for (int j=i+1;j<array.size();j++){
                if (array.get(i)+array.get(j) == k){
                    return true;
                } else if (array.get(i)+array.get(j) > k){
                    break;
                }
            }
        }
        return false;
    }

    private void recurse(TreeNode node){
        if (node == null){
            return;
        }
        array.add(node.val);
        if (node.left != null){
            recurse(node.left);
        }
        if (node.right != null){
            recurse(node.right);
        }
    }
}
