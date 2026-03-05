import java.util.Scanner; 
public class PrecedenceOps { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(); 
        System.out.println("Results: " + (a + b * c) + ", " + (a * b + c) + ", " + (c + a / b) + ", " + (a 
% b + c)); 
        sc.close(); 
    } 
} 