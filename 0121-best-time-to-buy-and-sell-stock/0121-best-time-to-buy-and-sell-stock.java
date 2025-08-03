class Solution {
    public int maxProfit(int[] prices) {
        int Buy = 0;
        int Sell = 1;
        int maxProfit=0;
        
        if(prices.length == 1){
            return maxProfit ;
        }
        //while buy and sell price or equal we dont get profit 
        //sell = 6th index and length = 6 then it will stop 
        while(Sell<prices.length){
        // if selling price is higher then buy prices we can calculate the profit    
            if(prices[Sell] > prices[Buy]){
                int profit =prices[Sell]-prices[Buy];
                //use the Math.max method to store the maxprofit
                //in iteration 2 = 4rs ,3= 2rs (4,2) it return 4
                maxProfit=Math.max(maxProfit,profit);
            }else{
                Buy=Sell;
            }
            Sell++;
        }
        return maxProfit;
    }
}