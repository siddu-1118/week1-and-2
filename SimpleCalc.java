import java.util.Scanner; 
public class SimpleCalc { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        double a = sc.nextDouble(), b = sc.nextDouble(); 
        System.out.println("Results: Add=" + (a+b) + ", Sub=" + (a-b) + ", Mul=" + (a*b) + ", Div=" + (a/b)); 
        sc.close(); 
    } 
}