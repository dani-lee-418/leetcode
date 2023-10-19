package week5;

public class BestTimeToBuyAndSellStock_121 {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock_121 a = new BestTimeToBuyAndSellStock_121();
        int[] prices = {7,6,4,3,1};
        System.out.println(a.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        int sel = 1;

        while (sel < prices.length) {

            if(prices[buy] < prices[sel]){
                buy = sel;
                sel = sel+1;
            }else {
                maxProfit = prices[buy] - prices[sel];
            }
        }
        return maxProfit;
    }

}
