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
    public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null) return head;

		int size = 0;
		ListNode curr = head;
		while (curr != null) {
			size++;
			curr = curr.next;
		}

		ListNode prev;
		for (int i = 0; i < k % size; i++) {
			prev = null;
			curr = head;
			while (curr.next != null) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = null;
			curr.next = head;
			head = curr;
		}
		return head;
	}
}