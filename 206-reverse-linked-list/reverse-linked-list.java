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
		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.addFirst(head.val);
			head = head.next;
		}
		ListNode newHead = null;
		ListNode newTail = null;

		for (Integer integer : list) {
			if (newHead == null) {
				newHead = new ListNode(integer);
				newTail = newHead;
			} else {
				ListNode newNode = new ListNode(integer);
				newTail.next = newNode;
				newTail = newNode;
			}
		}
		return newHead;
		
	}
}