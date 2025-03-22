import java.util.Scanner;
public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n % 5 == 0 && n % 7 == 0) {
            System.out.println(n + " is divisible by both 5 and 7");
        }else{
            System.out.println(n + " is not divisible by both 5 and 7");
        }
        sc.close();
    }
}
