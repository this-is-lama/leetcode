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
    public ListNode oddEvenList(ListNode head) {
		ListNode oddHead = null;
		ListNode oddTail = null;
		ListNode evenHead = null;
		ListNode evenTail = null;
		ListNode curr = head;
		int index = 1;
		while (curr != null) {
			if (index % 2 != 0) {
				if (oddHead == null) {
					oddHead = new ListNode(curr.val);
					oddTail = oddHead;
				} else {
					ListNode newNode = new ListNode(curr.val);
					oddTail.next = newNode;
					oddTail = newNode;
				}
			} else {
				if (evenHead == null) {
					evenHead = new ListNode(curr.val);
					evenTail = evenHead;
				} else {
					ListNode newNode = new ListNode(curr.val);
					evenTail.next = newNode;
					evenTail = newNode;
				}
			}
			curr = curr.next;
			index++;
		}
		if (oddTail != null) {
			oddTail.next = evenHead;
			return oddHead;
		} else {
			return evenHead;
		}
	}
}