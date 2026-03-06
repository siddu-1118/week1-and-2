import java.util.Scanner; 
public class TripLog { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        String n = sc.next(), f = sc.next(), v = sc.next(), t = sc.next(); 
        double dTotal = (sc.nextDouble() + sc.nextDouble()) * 1.609; 
        int tTotal = sc.nextInt() + sc.nextInt(); 
        System.out.println("Total Distance by " + n + " from " + f + " to " + t + " via " + v + " is " + dTotal + " km in " + tTotal + " minutes"); 
        sc.close(); 
    } 
}