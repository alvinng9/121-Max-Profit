package org.example;

public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = prices[0];
        //iterate through the int array
        for (int price : prices) {
            //update the minimum price
            min = Math.min(price, min);
            //find the biggest price difference
            result = Math.max(result, price - min);
        }
        return result;
    }
}
