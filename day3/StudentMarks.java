import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<String> students = new ArrayList<>();
        List<Integer> marks = new ArrayList<>();

        
            for (int i = 0; i < n; i++) {
                System.out.print("Enter student name: ");
                students.add(sc.next());

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
