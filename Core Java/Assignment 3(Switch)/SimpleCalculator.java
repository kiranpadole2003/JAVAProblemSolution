import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter Second number :");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator(+, -, *, /, %) :");
        char operator = sc.next().charAt(0);

        int result = 0;
        boolean valid = true;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                }else
                {
                    System.out.println("Error: can not divide by zero");
                    valid = false;
                }
                break;

            case '%':
            if(num2 != 0){
                result = num1 % num2;
            }else
            {
                System.out.println("Error: can not module by zero");
                valid = false;
            }
                break;
        
            default:
                break;
        }
        
        if (valid) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
        sc.close();
    }
}
