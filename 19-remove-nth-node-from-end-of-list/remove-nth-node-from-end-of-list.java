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
    public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return null;
		}
		int length = 0;
		ListNode curr = head;
		while (curr != null) {
			length++;
			curr = curr.next;
		}

		int index = length - n;
		if (index == 0) {
			return head.next != null ? head.next : null;
		}

		ListNode prev = null;
		curr = head;
		for (int i = 0; i < index; i++) {
			prev = curr;
			curr = curr.next;
		}

		prev.next = curr.next != null ? curr.next : null;
		return head;
	}
}