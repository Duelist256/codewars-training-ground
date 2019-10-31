package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesInPairsTest {
    @Test
    public void testSwapPairs() {
        SwapNodesInPairs snip = new SwapNodesInPairs();
        SwapNodesInPairs.ListNode node = new SwapNodesInPairs.ListNode(1);
        SwapNodesInPairs.ListNode node2 = new SwapNodesInPairs.ListNode(2);
        node.next = node2;
        SwapNodesInPairs.ListNode node3 = new SwapNodesInPairs.ListNode(3);
        node2.next = node3;
        SwapNodesInPairs.ListNode node4 = new SwapNodesInPairs.ListNode(4);
        node3.next = node4;

        SwapNodesInPairs.ListNode result = snip.swapPairs(node);

        SwapNodesInPairs.ListNode expectedNode = new SwapNodesInPairs.ListNode(2);
        SwapNodesInPairs.ListNode expectedNode2 = new SwapNodesInPairs.ListNode(1);
        expectedNode.next = expectedNode2;
        SwapNodesInPairs.ListNode expectedNode3 = new SwapNodesInPairs.ListNode(4);
        expectedNode2.next = expectedNode3;
        SwapNodesInPairs.ListNode expectedNode4 = new SwapNodesInPairs.ListNode(3);
        expectedNode3.next = expectedNode4;

        assertEquals(expectedNode, result);
    }
}