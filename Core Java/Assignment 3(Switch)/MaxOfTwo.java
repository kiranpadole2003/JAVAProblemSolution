import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter frist number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();

        int max;

        if(num1 > num2){
            max = num1;
        }else{
            max = num2;
        }
        System.out.println("The Maximum of Two Number: " + max);
        sc.close();
    }
}
