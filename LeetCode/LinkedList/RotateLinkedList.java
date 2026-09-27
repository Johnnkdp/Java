class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int length = 1;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        k = k % length;

        if (k == 0) {
            return head;
        }

        temp.next = head;

        int steps = length - k;

        ListNode newTail = temp;

        while (steps > 0) {
            newTail = newTail.next;
            steps--;
        }

        head = newTail.next;
        newTail.next = null;

        return head;
    }
}