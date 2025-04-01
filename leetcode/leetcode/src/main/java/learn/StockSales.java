package learn;

//from https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class StockSales {
    public int caculateMaxProfit(int[] prices){
        int maxProfit = 0;
        for (int buyDay = 0; buyDay < prices.length - 1; buyDay++){
            for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay++){
                int dayProfit = prices[sellDay] - prices[buyDay];
                if (dayProfit > maxProfit){
                    maxProfit = dayProfit;
                }
            }
        }
        return maxProfit;

    }
}
