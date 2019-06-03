package easy.s83;

public class s83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while (list != null) {
            if (list.next != null) {
                break;
            }
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
