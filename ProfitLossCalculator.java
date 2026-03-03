public class ProfitLossCalculator {
    public static void main(String[] args) {
        // Given data
        double costPrice = 129.0;
        double sellingPrice = 191.0;

        // Calculations
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Single print statement for multiline output using \n (newline)
        // %.2f limits the decimals to two places for currency and percentage
        System.out.printf("The Cost Price is INR %.0f and Selling Price is INR %.0f\n" +
                          "The Profit is INR %.0f and the Profit Percentage is %.2f%%", 
                          costPrice, sellingPrice, profit, profitPercentage);
    }
}