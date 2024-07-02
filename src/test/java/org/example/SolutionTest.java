package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void maxProfitTest() {
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.maxProfit(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(0, solution.maxProfit(new int[]{7,6,4,3,1}));
    }

}