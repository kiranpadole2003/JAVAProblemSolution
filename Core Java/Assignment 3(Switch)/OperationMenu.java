import java.util.Scanner;

public class OperationMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x :");
        int x = sc.nextInt();

        System.out.println("Enter the value of y:");
        int y = sc.nextInt();

        System.out.println("Choose an operation : ");
        System.out.println("1. Equality");
        System.out.println("2. Less than");
        System.out.println("3. Quotient and Remainder");
        System.out.println("4. Range");
        System.out.println("5. Swap");

        System.out.println("Enter a Choice (1-5) :");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                if(x == y){
                    System.out.println("X and Y both are Equal");
                }else{
                    System.out.println("X and Y are not Equal");
                }
                break;

            case 2:
                if(x < y){
                    System.out.println("X is smaller than Y.");
                }else{
                    System.out.println("Y is smaller than X.");
                }
        
            case 3:
                if(y != 0){
                    int Quotient = x / y;
                    int Remainder = x % y;
                    System.out.println("Quotient : " + Quotient);
                    System.out.println("Remainder : "+ Remainder);
                }
                break;

                case 4:
                int start = Math.min(x, y);
                int end = Math.max(x, y);
                System.out.println("Numbers between " + start + " and " + end + ":");
                for (int i = start; i <= end; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                break;

            case 5:
                System.out.println("Before Swap: x = " + x + ", y = " + y);
                int temp = x;
                x = y;
                y = temp;
                System.out.println("After Swap: x = " + x + ", y = " + y);
                break;

            default:
                break;
        }
    }
}
