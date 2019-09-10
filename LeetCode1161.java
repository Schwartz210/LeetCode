package LeetCode;

import java.util.HashMap;
import java.util.Map;

class LeetCode1161 {
    private HashMap<Integer, Integer> sumOfLevels;
    public int maxLevelSum(TreeNode root) {
        if (root == null){
            return 0;
        }
        sumOfLevels = new HashMap<>();
        recursive(root, 1);
        Integer key, value;
        int max = (int) Math.pow(-10, 5);
        int maxKey = 0;
        for (Map.Entry e:sumOfLevels.entrySet()){
            key = (Integer) e.getKey();
            value = (Integer) e.getValue();
            if (value > max){
                max = value;
                maxKey = key;
            }
        }
        return maxKey;
    }

    private void recursive(TreeNode node, int level){
        if (node == null){
            return;
        }
        if (!sumOfLevels.containsKey(level)){
            sumOfLevels.put(level, node.val);
        } else {
            sumOfLevels.put(level, sumOfLevels.get(level)+node.val);
        }
        if (node.left != null){
            recursive(node.left, level+1);
        }
        if (node.right != null){
            recursive(node.right, level+1);
        }
    }
}