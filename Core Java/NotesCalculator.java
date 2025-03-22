import java.util.Scanner;
public class NotesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount :");
        int amount = sc.nextInt();

        int tensNotes = amount / 10;
        amount %= 10;

        int fiveNotes = amount / 5;
        amount %= 5;

        int oneNotes = amount;

        System.out.println("10s : " +tensNotes);
        System.out.println("5s : " +fiveNotes);
        System.out.println("1s : " +oneNotes);

        sc.close();
    }
}
