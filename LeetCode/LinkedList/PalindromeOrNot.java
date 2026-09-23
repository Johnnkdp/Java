// middle element finding
        ListNode slow = head;
        ListNode fast = head;
        if(head != null || head.next != null) return true;
        whiile(fast != null || fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        } return slow;
--------------------------------------------------------------------------------------------------------------------------------------------------------       
// reversal
new node = reversenode (slow.next){
    if(head!=null || head.next = null) return head;
    node front = head.next;
    front.next = head;
    head.next = null;
    return newhead;

}
--------------------------------------------------------------------------------------------------------------------------------------------------------------
node newhead = reverselist(slow.next);
slow = newhead;
fast = head;
while( slow!=null) {
    if( slow.data != fast.data);
    reverselist(newlist);
    return false;
}
slow = slow.next ;
fast = fast.next;
reverselist(newlist)
return true;
--------------------------------------------------------------------------------------------------------------------------------------------------------------
class Solution {

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverseList(slow.next);

        ListNode first = head;
        ListNode second = newHead;

        while (second != null) {
            if (first.val != second.val) {
                reverseList(newHead);
                return false;
            }

            first = first.next;
            second = second.next;
        }

        reverseList(newHead);

        return true;
    }

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;

        front.next = head;
        head.next = null;

        return newHead;
    }
}