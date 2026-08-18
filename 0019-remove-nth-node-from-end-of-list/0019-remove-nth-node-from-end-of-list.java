class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (len == n) {
            return head.next; 
        }
        ListNode prev = head;
        for (int i = 1; i < len - n; i++) {
            prev = prev.next;
        }
            prev.next = prev.next.next;
        return head;
    }
}