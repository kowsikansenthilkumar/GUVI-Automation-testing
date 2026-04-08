public class converter {
    public static void main(String[] args) {
        double d = 55.5;
        float f = (float) d;
        int i = (int) f;
        short s = (short) i;
        
        System.out.println("Double: " + d + " | Float: " + f + " | Int: " + i + " | Short: " + s);
    }
}
