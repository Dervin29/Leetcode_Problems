class Solution {
    public int maxProfit(int[] prices) {
        //intialise min to first element of the array and profit to zero 
        int min = prices[0];
        int profit = 0;

        //iterate through the prices array 
        for(int i=0; i<prices.length;i++)
        {
            //update the min value if prices is less than the previous min value 
            if(prices[i] < min)
            {
                min = prices[i];
            }
            //profit is taken as the max element between the
            //previous profit and (current index value - min value )
            profit = Math.max(profit, prices[i] - min );
        }
        return profit; //return the profit 
    }
}