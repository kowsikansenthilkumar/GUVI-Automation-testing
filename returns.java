
public class returns {

    static String getGrade(int marks) {
        int grade = marks / 10;
        switch (grade) {
            case 10:
            case 9:
                return "Grade A";
            case 8:
                return "Grade B";
            case 7:
                return "Grade h";
            case 6:
                return "Grade D";
            default:
                return "Grade F";
        }
    }

    public static void main(String[] args) {
        int marks = 85;
        System.out.println(getGrade(marks));
    }
}
