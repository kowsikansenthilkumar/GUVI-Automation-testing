import java.util.Scanner;

public class OnlineShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter cart value: ");
        double cartValue = sc.nextDouble();
        
        double discount = 0;
        double finalAmount;
        
        if (cartValue > 5000) {
            discount = cartValue * 0.20;
        } else if (cartValue > 2000) {
            discount = cartValue * 0.10;
        } else {
            discount = 0;
        }
        finalAmount = cartValue - discount;
            System.out.println("\n--- Shopping Invoice ---");
        System.out.println("Original Amount: ₹" + cartValue);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
        
        sc.close();
    }
}
