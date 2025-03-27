import java.util.Scanner;

public class IncrementDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        String num = scanner.next();
        scanner.close();
        
        if (num.length() != 5 || !num.matches("\\d{5}")) {
            System.out.println("Please enter a valid five-digit number.");
            return;
        }
        
        StringBuilder newNumber = new StringBuilder();
        for (char digit : num.toCharArray()) {
            newNumber.append((char) (((digit - '0' + 1) % 10) + '0'));
        }
        
        System.out.println("New number: " + newNumber);
    }
}
