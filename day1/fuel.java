public class fuel {
    public static void main(String[] args) {
        double distance = 150.0;  
        double mileage = 15.0;   
        double fuelPrice = 100.0; 
        double fuelUsed = distance / mileage;
        double totalCost = fuelUsed * fuelPrice;
        System.out.println("Fuel Used: " + fuelUsed + " liters");
        System.out.println("Total Fuel Cost: ₹" + totalCost);
    }
}
