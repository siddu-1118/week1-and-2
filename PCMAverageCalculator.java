public class PCMAverageCalculator {
    public static void main(String[] args) {
        // Input values
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int totalSubjects = 3;

        // Calculate total and average
        double totalMarks = maths + physics + chemistry;
        double averageMark = totalMarks / totalSubjects;

        // Output the result
        System.out.println("Sam’s average mark in PCM is " + averageMark);
    }
}