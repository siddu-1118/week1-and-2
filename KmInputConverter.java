import java.util.Scanner; 
public class KmInputConverter { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter distance in km: "); 
        double kmVal = sc.nextDouble(); 
        System.out.println("The total miles is " + (kmVal * 1.6) + " mile for the given " + kmVal + 
" km"); 
        sc.close(); 
    } 
} 
