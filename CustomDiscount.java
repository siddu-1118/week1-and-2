import java.util.Scanner; 
public class CustomDiscount { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner reader = new Scanner(System.in); 
        System.out.print("Enter Fee: "); 
        double f = reader.nextDouble(); 
        System.out.print("Enter Discount %: "); 
        double d = reader.nextDouble(); 
        double save = (d / 100) * f; 
        System.out.println("The discount amount is INR " + save + " and final fee is INR " + (f - 
save)); 
        reader.close(); 
    } 
} 