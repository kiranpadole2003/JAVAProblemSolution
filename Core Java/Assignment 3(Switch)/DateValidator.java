import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day:");
        int day = sc.nextInt();

        System.out.println("Enter the month:");
        int month = sc.nextInt();

        System.out.println("Enter the year:");
        int year = sc.nextInt();

        boolean isValid = true;

        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            int maxDays;

            switch (month) {
                case 4, 6, 9, 11:
                    maxDays = 30;
                    break;

                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        maxDays = 29;
                    } else {
                        maxDays = 28;
                    }
                    break;

                default:
                    maxDays = 31;
            }

            if (day < 1 || day > maxDays) {
                isValid = false;
            }
        }

        if (isValid) {
            System.out.println("Valid Date");
        } else {
            System.out.println("Invalid Date");
        }

        sc.close();
    }
}
