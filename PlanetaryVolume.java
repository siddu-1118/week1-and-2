public class PlanetaryVolume { 
    public static void main(String[] args) { 
        // Sai Siddharth 
        double rKm = 6378; 
        double vKm3 = (4.0/3.0) * 3.1416 * Math.pow(rKm, 3); 
        double vMi3 = vKm3 * Math.pow(0.621371, 3); 
        System.out.println("The volume of earth in cubic kilometers is " + vKm3 +  
                           " and cubic miles is " + vMi3); 
    } 
} 