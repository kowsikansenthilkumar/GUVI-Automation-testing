import java.util.*;

public class TemperatureExample {
    public static void main(String[] args) {

        List<Integer> tempList = new ArrayList<>();
        tempList.add(30);
        tempList.add(25);
        tempList.add(30);
        tempList.add(28);
        tempList.add(25);

        Set<Integer> tempSet = new HashSet<>(tempList);
        System.out.println("Temperature List: " + tempList);
        System.out.println("Unique Temperatures: " + tempSet);
    }
}
