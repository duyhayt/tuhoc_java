package ThuatToan;

class ListNode {

  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }
}

class Solution2 {

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        current.next = l1;
        l1 = l1.next;
      } else {
        current.next = l2;
        l2 = l2.next;
      }
      current = current.next;
    }

    if (l1 != null) {
      current.next = l1;
    }

    if (l2 != null) {
      current.next = l2;
    }

    return dummy.next;
  }
}

public class  MergeTwoSortedLists  {

  public static void main(String[] args) {
    Solution2 solution = new Solution2();

    // Tạo danh sách liên kết 1: 1 -> 2 -> 4
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    // Tạo danh sách liên kết 2: 1 -> 3 -> 4
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    // Gộp hai danh sách liên kết
    ListNode mergedList = solution.mergeTwoLists(l1, l2);

    // In kết quả
    while (mergedList != null) {
      System.out.print(mergedList.val + " ");
      mergedList = mergedList.next;
    }
  }
}