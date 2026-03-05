import java.util.Scanner; 
public class InventoryBill { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        double price = sc.nextDouble(); 
        int qty = sc.nextInt(); 
        System.out.println("The total purchase price is INR " + (price*qty) + " if quantity " + qty + 
" and unit price is INR " + price); 
        sc.close(); 
    } 
} 