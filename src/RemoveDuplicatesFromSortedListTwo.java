/*
https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
leaving only distinct numbers from the original list. Return the linked list sorted as well.
 */
public class RemoveDuplicatesFromSortedListTwo {
	// Defined from LeetCode
	private static class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static void main(String[] args) {

	}

	private static ListNode deleteDuplicates(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode node = new ListNode(0);
		if (node.next == null) {
			return node;
		}

		while (head.next != null && head.next.next != null) {
			if (node.next.val != head.next.next.val) {
				head = head.next;
			}

		}

		return null;
	}
}
