import java.util.Scanner;

public class FractionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numerator of first fraction :");
        int num1 = sc.nextInt();
        System.out.println("Enter the denominator of first fraction:");
        int den1 = sc.nextInt();

        System.out.println("Enter numerator of second fraction:");
        int num2 = sc.nextInt();
        System.out.println("Enter denominator of second fraction:");
        int den2 = sc.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Add Fractions");
        System.out.println("2. Subtract Fractions");
        System.out.println("3. Multiply Fractions");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        int resultNum = 0;
        int resultDen = 0;

        switch (choice) {
        case 1:
            resultNum = (num1 * den2) + (num2 * den1);
            resultDen = den1 * den2;
            break;

        case 2:
            resultNum =  (num1 * den2) - (num2 * den1);
            resultDen = den1 * den2;

        case 3: // Multiply
            resultNum = num1 * num2;
            resultDen = den1 * den2;
            break;

        default:
            System.out.println("Invalid choice.");
            sc.close();
            return;
    }
        
        // Simplify the result
        int gcd = findGCD(resultNum, resultDen);
        resultNum /= gcd;
        resultDen /= gcd;

        // Handle sign
        if (resultDen < 0) {
            resultNum *= -1;
            resultDen *= -1;
        }

        System.out.println("Result: " + resultNum + "/" + resultDen);

        sc.close();
    }

    // Helper method to find GCD
    public static int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
            
        
    

