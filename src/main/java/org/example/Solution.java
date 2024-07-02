package org.example;

public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = prices[0];
        for (int price : prices) {
            min = Math.min(min, price);
            result = Math.max(result, price - min);
        }
        return result;
    }
}
