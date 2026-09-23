slow = head;
fast = head;

while (fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;

    if (slow == fast) {
        break;
    }
}

if (slow != fast) {
    return 0;
}

fast = slow.next;

while (fast != slow) {
    fast = fast.next;
    size += 1;
}

return size;