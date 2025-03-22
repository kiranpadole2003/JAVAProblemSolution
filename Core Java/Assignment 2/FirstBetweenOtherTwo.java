import java.util.Scanner;
public class FirstBetweenOtherTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter a Second number : ");
        int b = sc.nextInt();

        System.out.print("Enter a Third Number : ");
        int c = sc.nextInt();

        if(a>=b && a<=c){
            System.out.printf("%d is between %d and %d", a, b, c);
        }else{
            System.out.printf("%d is not between %d and %d", a, b, c);
        }
        sc.close();
    }
}


