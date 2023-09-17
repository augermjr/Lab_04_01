public class Main {
    public static void main(String[] args) {
        double price = 31.40;
        double taxRate = 0.05;
        double tax = price * taxRate;
        double finalPrice = price + tax;
        System.out.println("Your purchase of $" + price + " will include sales tax of $" + tax + " with the final price of $" + finalPrice);
    }
}