import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> students = new ArrayList<>();
        List<Integer> marks = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student name: ");
            students.add(sc.nextLine());

            System.out.print("Enter mark: ");
            marks.add(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " - " + marks.get(i));
        }
    }
}