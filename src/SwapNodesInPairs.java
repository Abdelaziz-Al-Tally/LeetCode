/*
https://leetcode.com/problems/swap-nodes-in-pairs/description/
Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the list's nodes
(i.e., only nodes themselves may be changed.)
 */
public class SwapNodesInPairs {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		ListNode result = swapPairs(node1);
	}

	private static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode myPointer = dummy;

		while (myPointer != null) {
			ListNode p1 = myPointer.next;
			if (p1 != null && p1.next != null) {
				ListNode p2 = p1.next;
				// Swap
				myPointer.next = p2;
				p1.next = p2.next;
				p2.next = p1;

				myPointer = myPointer.next.next;
			} else {
				break;
			}
		}
		return dummy;
	}
}
