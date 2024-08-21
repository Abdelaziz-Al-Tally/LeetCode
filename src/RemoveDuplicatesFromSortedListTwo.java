/*
https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
leaving only distinct numbers from the original list. Return the linked list sorted as well.
 */
public class RemoveDuplicatesFromSortedListTwo {
	public static void main(String[] args) {}

	private static ListNode deleteDuplicates(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;
		while (head != null) {
			boolean isDuplicate = false;

			while (head.next != null && head.val == head.next.val) {
				head = head.next;
				isDuplicate = true;
			}

			if (isDuplicate) {
				prev.next = head.next;
			} else {
				prev = prev.next;
			}

			head = head.next;
		}

		return dummy.next;
	}
}
