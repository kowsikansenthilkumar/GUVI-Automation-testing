import java.util.*;

class student {
    String name;
    int regno;
    List<Integer> marks;

    student(String name, int regno, List<Integer> marks) {
        this.name = name;
        this.regno = regno;
        this.marks = marks;
    }

    void performance() {
        int total = 0;

        for (int m : marks) {
            total += m;
        }

        double avg = total / 5.0;

        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regno);
        System.out.println("Average: " + avg);

        if (avg >= 75) {
            System.out.println("Performance: Excellent");
        } else if (avg >= 50) {
            System.out.println("Performance: Good");
        } else {
            System.out.println("Performance: Poor");
        }
    }
}

public class main {
    public static void main(String[] args) {

        List<Integer> m1 = Arrays.asList(80, 70, 75, 90, 85);

        student s1 = new student("Kowsikan", 101, m1);

        s1.performance();
    }
}