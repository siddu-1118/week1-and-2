public class DistanceConverter {
    public static void main(String[] args) {
        // Given data
        double km = 10.8;
        double conversionFactor = 1.6; // As per hint: 1 km = 1.6 miles
        
        // Calculation
        double miles = km * conversionFactor;
        
        // Output display
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}