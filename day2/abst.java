abstract class bike {
    abstract void run();
    void start() {
        System.out.println("Bike is starting...");
    }
}
class key extends bike {
    void run() {
        System.out.println("Bike is on...");
    }
}

public class abst {
    public static void main(String[] args) {
        key k = new key();
        k.start();
        k.run();
        
    }
}