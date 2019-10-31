package leetcode;

public class SwapNodesInPairs {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

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

    public static void main(String[] args) {
        SwapNodesInPairs snip = new SwapNodesInPairs();
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;

        snip.swapPairs(node);
    }
}
