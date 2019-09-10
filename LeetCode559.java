package LeetCode;

class LeetCode559 {
    private int depth;
    public int maxDepth(Node root) {
        if (root == null){
            return 0;
        }
        depth = 1;
        recursive(root, depth);
        return depth;
    }

    public void recursive(Node node, int level){
        if (node == null){
            return;
        }
        if (level > depth){
            depth = level;
        }
        if (node.children.size() > 0){
            for (Node n:node.children){
                recursive(n, level+1);
            }
        }
    }
}