import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month number (1-12)");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("This month has 30 days");
            break;

            case 2:
            System.out.println("February has 28 or 29 days (depending on leap year).");
            break;
        
            default:
            System.out.println("Invalid month number! Please enter a number between 1 and 12.");
            break;
        }
        sc.close();
    }
}
