// give share prices for a particular week example {7, 5, 2, 6, 0, 8, 1}
// write a program to display the max profit earned by buying and selling of these shares
// note that we have to buy first and then we can sell
// when price is 0, it means market is closed and buying and selling is not possible
// result - maximum profit => buy_price = 2, sell_price = 8, max_profit = 6
// if you are not able to sell the shares, max_profit = 0

class ShareProfit {
    public static void main(String[] args) {
        int[] prices = {7, 5, 2, 6, 0, 8, 1};

        int maxProfit = getMaxProfit(prices);

        System.out.println("Maximum Profit = " + maxProfit);
    }

    static int getMaxProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == 0) {
                continue;
            }

            if (prices[i] < minPrice&& i != prices.length-1) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}

// 