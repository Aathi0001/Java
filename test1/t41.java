package test1;

public class t41 {
	public static void BuySellStock(int[] a) {
		int minPrice = a[0];
		int minIndex = 0;
		int maxProfit = 0;
		int buyDay = 0;
		int sellDay = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] < minPrice) {
				minPrice = a[i];
				minIndex = i;
			} else {
				int profit = a[i] - minPrice;
				if (profit > maxProfit) {
					maxProfit = profit;
					buyDay = minIndex;
					sellDay = i;
				}
			}
		}

		System.out.println("Max Profit: " + maxProfit);
		System.out.println("Buy on Day " + buyDay + " (Price: " + a[buyDay] + ")");
		System.out.println("Sell on Day " + sellDay + " (Price: " + a[sellDay] + ")");
	}

	public static void main(String[] args) {
		int[] a = {7, 1, 5, 3, 6, 4};
		BuySellStock(a);
	}
}
