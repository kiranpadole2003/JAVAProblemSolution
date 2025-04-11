import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rate = 83.2;
        double amount, converted;
        int choice;

        System.out.println("Currency Converter");
        System.out.println("1. Dollar to Rupees");
        System.out.println("2. Rupees to Dollar");
        System.out.println("Enter your choice (1 or 2): ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter amount in Dollar: ");
                amount = sc.nextDouble();
                converted = amount * rate;
                System.out.println("Amount in Rupees: ₹" + converted);
                break;

            case 2:
                System.out.println("Enter amount in Rupees: ");
                amount = sc.nextDouble();
                converted = amount / rate;
                System.out.println("Amount in Dollars: $" + converted);
                break;
                
            default:
                break;
        }
        sc.close();
    }
}
