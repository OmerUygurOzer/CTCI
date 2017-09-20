/**
 * Created by Omer on 2/13/2017.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices.length==1){return 0;}

        int min = Integer.MAX_VALUE;
        int res = 0;

        for(int i = 0; i < prices.length; i++){
            min = Math.min(min,prices[i]);
            if(prices[i]>min){
                res = Math.max(res,prices[i]-min);
            }
        }

        return res;
    }
}
