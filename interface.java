class user {
    String name;
    int age;
    String location;
}

class subs {
    int id;
    int days;
}

class payment {
    String status;
}

public class Main {
    public static void main(String[] args) {

        user u = new user();
        u.name = "Kowsikan";
        u.age = 21;
        u.location = "Chennai";

        subs s = new subs();
        s.id = 101;
        s.days = 30;

        payment p = new payment();
        p.status = "accepted";

        System.out.println("User Name: " + u.name);
        System.out.println("Age: " + u.age);
        System.out.println("Location: " + u.location);

        System.out.println("Subscription ID: " + s.id);
        System.out.println("Days: " + s.days);

        System.out.println("Payment Status: " + p.status);
    }
}