class student {
    private String brand;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class encap {
    public static void main(String[] args) {
        student s = new student();
        s.setBrand("Toyota");
        s.setYear(2020);
        System.out.println("brand: " + s.getBrand());
        System.out.println("year: " + s.getYear());
    }

}