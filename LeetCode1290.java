package LeetCode;

class LeetCode1290 {
    public int getDecimalValue(ListNode head) {
        String num = traverse(head);
        int decimal = Integer.valueOf(num, 2);
        return decimal;
    }

    private String traverse(ListNode head){
        StringBuilder sb = new StringBuilder();
        ListNode n = head;
        while (n != null){
            sb.append(n.val);
            n = n.next;
        }
        return sb.toString();
    }
}