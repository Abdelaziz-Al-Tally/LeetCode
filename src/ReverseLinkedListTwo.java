/*
https://leetcode.com/problems/reverse-linked-list-ii/description/
Given the head of a singly linked list and two integers left and right where left <= right,
reverse the nodes of the list from position left to position right, and return the reversed list.
 */
public class ReverseLinkedListTwo {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		int left = 2;
		int right = 4;

		ListNode result = reverseBetween(node1, left, right);
	}

	private static ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode preLeft = dummy;

		for (int i = 1; i < left; i++) {
			preLeft = preLeft.next;
		}

		ListNode leftNode = preLeft.next;
		ListNode curr = leftNode.next;

		for (int i = left; i < right; i++) {
			leftNode.next = curr.next;
			curr.next = preLeft.next;
			preLeft.next = curr;
			curr = leftNode.next;
		}
		return dummy.next;
	}
}
