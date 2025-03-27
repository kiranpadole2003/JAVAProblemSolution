import java.util.Scanner;

public class MonthlyIncomeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dailyWages = 350;
        int dailyFine = 30;

        System.out.print("Enter the number of days worked: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of days absent: ");
        int n = sc.nextInt();

        int income = (m * dailyWages)- (n * dailyFine);

        System.out.println("The monthly income is: Rs " + income);

        sc.close();
    }
}
