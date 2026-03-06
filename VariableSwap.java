import java.util.Scanner; 
public class VariableSwap { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        int n1 = sc.nextInt(), n2 = sc.nextInt(); 
        int holder = n1; n1 = n2; n2 = holder; 
        System.out.println("The swapped numbers are " + n1 + " and " + n2); 
        sc.close(); 
    } 
} 