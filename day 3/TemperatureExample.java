import java.util.*;

public class TemperatureExample {
    public static void main(String[] args) {

        // List to store temperatures (duplicates allowed)
        List<Integer> tempList = new ArrayList<>();
        tempList.add(30);
        tempList.add(25);
        tempList.add(30);
        tempList.add(28);
        tempList.add(25);

        // Set to remove duplicate temperatures
        Set<Integer> tempSet = new HashSet<>(tempList);

        // Display original list
        System.out.println("Temperature List: " + tempList);

        // Display unique temperatures
        System.out.println("Unique Temperatures: " + tempSet);
    }
}
