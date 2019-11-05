package leetcode;

public class SwapNodesInPairs {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public static ListNode of(int... elems) {
            if (elems.length == 0) return null;
            else {
                ListNode result = new ListNode(elems[0]);
                ListNode ptr = result;
                for (int i = 1; i < elems.length; i++) {
                    ptr.next = new ListNode(elems[i]);
                    ptr = ptr.next;
                }
                return result;
            }
        }

        @Override
        public boolean equals(Object obj) {
            ListNode thisPtr = this;
            ListNode thatPtr = (ListNode) obj;
            while (thisPtr != null || thatPtr != null) {
                if (thisPtr == null || thatPtr == null || thisPtr.val != thatPtr.val) return false;
                else {
                    thisPtr = thisPtr.next;
                    thatPtr = thatPtr.next;
                }
            }
            return true;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        else {
            ListNode result = new ListNode(head.next.val);
            result.next = new ListNode(head.val);
            processRest(head.next.next, result.next);
            return result;
        }
    }

    private void processRest(ListNode src, ListNode target) {
        if (src != null) {
            if (src.next == null) {
                target.next = new ListNode(src.val);
            } else {
                target.next = new ListNode(src.next.val);
                target.next.next = new ListNode(src.val);
                processRest(src.next.next, target.next.next);
            }
        }
    }
}
