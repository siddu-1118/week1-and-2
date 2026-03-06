import java.util.Scanner; 
public class InterestCalc { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble(); 
        System.out.println("The Simple Interest is " + (p*r*t/100) + " for Principal " + p); 
        sc.close(); 
    } 
} 