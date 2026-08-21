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
    public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) return true;
		
		List<Integer> list = new java.util.LinkedList<>();
		ListNode curr = head;
		while (curr != null) {
			list.add(curr.val);
			curr = curr.next;
		}
		
		while (!list.isEmpty()) {
			if (!Objects.equals(list.getFirst(), list.getLast())) {
				return false;
			}
			list.removeFirst();
			if (!list.isEmpty()) {
				list.removeLast();
			}
		}
		
		return true;
	}
}