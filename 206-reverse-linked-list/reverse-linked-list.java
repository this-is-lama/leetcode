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
    public ListNode reverseList(ListNode head) {
		if (head == null) return null;
		
		ListNode newHead = reverse(head, head.next);
		head.next = null;
		
		return newHead;
	}

	public ListNode reverse(ListNode head, ListNode curr) {
		if (curr == null) {
			return head;
		}
		ListNode temp = curr.next;
		curr.next = head;
		return reverse(curr, temp);
	}
}