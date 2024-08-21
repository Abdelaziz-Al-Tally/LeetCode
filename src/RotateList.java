/*
https://leetcode.com/problems/rotate-list/
Given the head of a linked list, rotate the list to the right by "k" places.

Constraints:
- The number of nodes in the list is in the range [0, 500].
- -100 <= Node.val <= 100
- 0 <= k <= 2 * 10^9
 */
public class RotateList {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(0);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println(rotateRight(node1, 4));
	}
	private static ListNode rotateRight(ListNode head, int k) {
		if (k == 0 || head == null || head.next == null) {
			return head;
		}

		int linkedListLength = 1;
		ListNode tempHead = head;
		while (tempHead.next != null) {
			tempHead = tempHead.next;
			linkedListLength++;
		}

		k = k % linkedListLength;
		if (k == 0) {
			return head;
		}

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		while (k != 0) {
			while (head.next.next != null) {
				head = head.next;
			}
			ListNode lastNode = head.next;
			lastNode.next = dummy.next;
			dummy.next = lastNode;
			head.next = null;
			head = dummy.next;
			k--;
		}
		return dummy.next;
	}
}
