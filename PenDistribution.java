public class PenDistribution {
    public static void main(String[] args) {
        // Given data
        int totalPens = 14;
        int totalStudents = 3;

        // Calculations
        int pensPerStudent = totalPens / totalStudents; // Integer division
        int remainingPens = totalPens % totalStudents;  // Modulus for remainder

        // Output display
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}