/*
https://leetcode.com/problems/merge-two-sorted-lists/description/
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {
	public static void main(String[] args) {
		ListNode node1_1 = new ListNode(1);
		ListNode node1_2 = new ListNode(2);
		ListNode node1_3 = new ListNode(4);
		node1_1.next = node1_2;
		node1_2.next = node1_3;

		ListNode node2_1 = new ListNode(1);
		ListNode node2_2 = new ListNode(3);
		ListNode node2_3 = new ListNode(4);
		node2_1.next = node2_2;
		node2_2.next = node2_3;

		ListNode result = mergeTwoLists(node1_1, node2_1);
	}

	private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}

		if (list1 != null) {
			current.next = list1;
		} else if (list2 != null) {
			current.next = list2;
		}

		return dummy.next;
	}
}
