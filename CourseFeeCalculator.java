public class CourseFeeCalculator {
    public static void main(String[] args) {
        // 1. Create variables as per hints
        double fee = 125000;
        double discountPercent = 10;

        // 2. Compute discount amount
        // Formula: (Percentage / 100) * Total
        double discount = (discountPercent / 100) * fee;

        // 3. Compute final price to pay
        double finalFee = fee - discount;

        // 4. Output the results
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
    }
}