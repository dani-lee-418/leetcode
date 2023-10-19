package week5;

public class BestTimeToBuyAndSellStock_121 {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock_121 a = new BestTimeToBuyAndSellStock_121();
        int[] prices = {7,6,4,3,1};
        System.out.println(a.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {

            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                if(maxProfit < profit){
                    maxProfit =profit;
                }

            }else {
                left = right;
            }
            right = right + 1;
        }
        return maxProfit;
    }

}
