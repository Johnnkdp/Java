public class  {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {

            if (a == null)
                a = headB;
            else
                a = a.next;

            if (b == null)
                b = headA;
            else
                b = b.next;
        }

        return a;
    }
}
///
/// ///
/// /// ///
ListNode temp1 = headnode1;
ListNode temp2 = headnode2;
while(temp1 != temp2) {
    temp1 = temp1.next;
    temp2 = temp2.next;
    if(temp1 == temp2) return temp1;
    if(temp1 == null) temp1 = headnode2;
    if(temp2 == null) temp2 = headnode1;
    return temp1;
} 