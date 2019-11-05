package leetcode;

import org.junit.Test;

import static leetcode.SwapNodesInPairs.*;
import static org.junit.Assert.*;

public class SwapNodesInPairsTest {
    @Test
    public void testSwapPairs() {
        SwapNodesInPairs snip = new SwapNodesInPairs();
        assertEquals(snip.swapPairs(ListNode.of(1, 2, 3, 4)), ListNode.of(2, 1, 4, 3));
    }
}