import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int temp = num1;
            num1 = num2;
            num2 = temp;

        System.out.println("After swapping: ");
        System.out.println("Frist number: "+num1);
        System.out.println("Second Number: "+num2);

        sc.close();
    }
}
