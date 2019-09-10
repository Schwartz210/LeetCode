package LeetCode;

import java.util.ArrayList;
import java.util.List;

class LeetCode637 {
    private ArrayList<ArrayList<Double>> values;
    public List<Double> averageOfLevels(TreeNode root) {
        values = new ArrayList<>();
        traversal(root, 1);
        ArrayList<Double> results = new ArrayList<>();
        for (ArrayList<Double> array:values){
            results.add(average(array));
        }
        return results;
    }

    private void traversal(TreeNode node, int level){
        if (node == null){
            return;
        }
        if (values.size() < level){
            values.add(new ArrayList<>());
        }
        values.get(level-1).add((double) node.val);
        if (node.left != null){
            traversal(node.left, level+1);
        }
        if (node.right != null){
            traversal(node.right, level+1);
        }
    }

    private Double average(ArrayList<Double> array){
        double total = 0.0;
        for (double elem:array){
            total += elem;
        }
        double result = total / array.size();
        return result;
    }
}