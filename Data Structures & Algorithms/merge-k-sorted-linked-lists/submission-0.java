class Solution {
	public ListNode mergeKLists(ListNode[] lists) {

		ListNode dummy = new ListNode();
		ListNode cur = dummy;
		while (true) {
			int minVal = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null && lists[i].val < minVal) {
					minIndex = i;
					minVal = lists[i].val;
				}
			}
			if (minIndex == -1)
				break;

			cur.next = new ListNode(minVal);
			cur = cur.next;
			lists[minIndex] = lists[minIndex].next;
		}

		return dummy.next;

	}
}
