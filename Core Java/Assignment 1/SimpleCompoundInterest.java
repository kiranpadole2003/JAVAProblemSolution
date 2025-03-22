import java.util.Scanner;
public class SimpleCompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principle :");
        double p = sc.nextDouble();

        System.out.print("Enter the no.of years:");
        int n = sc.nextInt();

        System.out.print("Rate of interest in %:");
        double r = sc.nextDouble();

        double simpleInterest = (p * n * r) / 100;
        double compoundInterest = p * (Math.pow((1 + r / 100), n))-p;

        System.out.println("\nSimple Interest: " +simpleInterest);
        System.out.println("Compund Imterest: " +compoundInterest);

        sc.close();
    }
}
