/*
https://leetcode.com/problems/remove-nth-node-from-end-of-list/
Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
public class RemoveNthNodeFromEndOfList {
	public static void main(String[] args) {

	}
	private static class ListNode {
		int val;
		ListNode next;
		ListNode(){}
		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	private ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode fastNode = dummy;
		ListNode slowNode = dummy;

		for (int i = 0; i <= n; i++) {
			fastNode = fastNode.next;
		}

		while(fastNode != null) {
			fastNode = fastNode.next;
			slowNode = slowNode.next;
		}

		slowNode.next = slowNode.next.next;
		return dummy.next;
	}
}
