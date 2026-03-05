import java.util.Scanner; 
public class FeetConverter { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        double feet = sc.nextDouble(); 
        double yards = feet / 3.0; 
        System.out.println("The distance in yards is " + yards + " while distance in miles is " + 
(yards/1760.0)); 
        sc.close(); 
    } 
}