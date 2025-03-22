import java.util.Scanner;
public class RotateVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.printf("the three number is %d, %d, %d", a, b, c);

        sc.close();
    }
}
