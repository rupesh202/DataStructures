public class StockBuySell {
    public static void main(String[] args) {
        StockBuySell stockBuySell = new StockBuySell();
        int[] input = new int[]{1,5,3,8,12};
        System.out.println(stockBuySell.maxProfit(input));

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
 }
