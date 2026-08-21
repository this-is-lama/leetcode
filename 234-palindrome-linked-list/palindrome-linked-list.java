/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode left;

public boolean isPalindrome(ListNode head) {
    left = head;
    return check(head);
}

private boolean check(ListNode right) {
    if (right == null) {
        return true;
    }

    if (!check(right.next)) {
        return false;
    }

    if (left.val != right.val) {
        return false;
    }

    left = left.next;

    return true;
}
}