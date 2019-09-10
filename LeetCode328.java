package LeetCode;

import java.util.ArrayList;

class LeetCode328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null){
            return head;
        }
        if (head.next == null){
            return head;
        }
        ArrayList<ListNode> odds = new ArrayList<>();
        ArrayList<ListNode> evens = new ArrayList<>();
        boolean isOdd = false;
        ListNode n = head.next;
        while (n != null){
            if(isOdd){

                odds.add(n);
            } else {
                evens.add(n);
            }
            n = n.next;
            isOdd = !isOdd;
        }
        odds.addAll(evens);
        n = head;
        for (ListNode node:odds){
            n.next = node;
            n = n.next;
        }
        n.next = null;
        n = head;
        while (n != null){
            n = n.next;
        }
        return head;
    }
}