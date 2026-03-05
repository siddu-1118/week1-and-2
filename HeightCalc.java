import java.util.Scanner; 
public class HeightCalc { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter height in cm: "); 
        double cm = sc.nextDouble(); 
        double totalIn = cm / 2.54; 
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f",  
                          cm, (int)(totalIn/12), (totalIn%12)); 
        sc.close(); 
    } 
}