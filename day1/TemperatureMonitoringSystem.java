import java.util.Scanner;

public class TemperatureMonitoringSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature as double: ");
        double tempDouble = sc.nextDouble();
        
        int tempInt = (int) tempDouble;
        
        double difference = tempDouble - tempInt;
        
        System.out.println("\nTemperature as double: " + tempDouble);
        System.out.println("Temperature as int: " + tempInt);
        System.out.println("Difference: " + difference);
        
        sc.close();
    }
}
