import java.util.Scanner; 
public class TrackRounds { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        double p = sc.nextDouble() + sc.nextDouble() + sc.nextDouble(); 
        System.out.println("Rounds required for 5km: " + (5000 / p)); 
        sc.close(); 
    } 
} 