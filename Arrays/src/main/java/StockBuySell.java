public class StockBuySell {
    public static void main(String[] args) {
        StockBuySell stockBuySell = new StockBuySell();
        int[] input = new int[]{1,5,3,8,12};
        int[] input1 = new int[]{7,1,5,3,6,4};
        System.out.println(stockBuySell.maxProfit(input1));
        System.out.println(stockBuySell.profit(input1));

    }
    public int maxProfit(int[] input){
        int profit =0;

        for (int i=1; i< input.length; i++){

            if (input[i] > input[i-1]){
                profit += input[i] - input[i-1];
            }
        }

        return profit;
    }
    public int profit(int[] prices){
        int profit =0;
        for(int i=0; i<prices.length-1;i++){
            if(prices[i+1] > prices[i]){
                profit += (prices[i+1] - prices[i]) ;
            }
        }
        return profit;
    }
 }
