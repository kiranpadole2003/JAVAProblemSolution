import java.util.Scanner;
public class DigitChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        }else {
            System.out.println(ch + " is not a digit.");
        }
        sc.close();
    }
}
