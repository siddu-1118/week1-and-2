import java.util.Scanner; 
public class GeometryTriangle { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        Scanner sc = new Scanner(System.in); 
        double b = sc.nextDouble(), h = sc.nextDouble(); 
        double areaCm = 0.5 * b * h; 
        System.out.println("The Area of the triangle in sq in is " + (areaCm/6.4516) + " and sq cm is " + areaCm); 
        sc.close(); 
    } 
} 