import java.util.Scanner; 
public class Payroll { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        double s = sc.nextDouble(), b = sc.nextDouble(); 
        System.out.println("Salary: INR " + s + ", Bonus: INR " + b + ". Total Income: INR " + 
(s+b)); 
        sc.close(); 
    } 
}