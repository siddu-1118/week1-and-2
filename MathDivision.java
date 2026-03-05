import java.util.Scanner; 
public class MathDivision { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        int n1 = sc.nextInt(), n2 = sc.nextInt(); 
        System.out.println("The Quotient is " + (n1/n2) + " and Reminder is " + (n1%n2) + " of numbers " + n1 + " and " + n2); 
        sc.close(); 
    } 
} 