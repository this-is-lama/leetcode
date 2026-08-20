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
    public ListNode removeElements(ListNode head, int val) {
		if (head == null) return null;

		
		while (head != null && head.val == val) {
			head = head.next;
		}
		ListNode curr = head;
		ListNode prev = head;
		while (curr != null) {
			if (curr.val == val) {
				while (curr != null && curr.val == val) {
					curr = curr.next;
				}
				prev.next = curr;
			}
			prev = curr;
			curr = curr == null ? null : curr.next;
		}
		return head;
	}
}