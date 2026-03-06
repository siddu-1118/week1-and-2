import java.util.Scanner; 
public class HandshakeLogic { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        long n = sc.nextLong(); 
        System.out.println("Maximum handshakes: " + (n * (n - 1) / 2)); 
        sc.close(); 
    } 
}