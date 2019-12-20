package LeetCode;

import java.util.HashSet;

public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null){
            return null;
        }
        HashSet<ListNode> set = new HashSet<>();
        ListNode node = head;
        while (node != null){
            if (set.contains(node)){
                return node;
            } else {
                set.add(node);
                node = node.next;
            }
        }
        return null;
    }
}