import java.util.Scanner;

public class IntegerInterchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a :");
        int a = sc.nextInt();

        System.out.print(" Enter b :");
        int b = sc.nextInt();

        System.out.printf("Before swap : a = %d, b = %d\n",a, b);

        // int c = a;
        //  a = b;
        //  b = c;

        //  a = a + b;
        //  b = a - b;
        //  a = a - b;

        /* 
        a = a * b;
        b = a / b;
        a = a / b;
        */

       /* 
        a = a ^ b;
        b = a ^ b;
        a = a ^ b; 
        */

        a = a + b - (b = a);

         System.out.printf("After swap: a = %d, b = %d",a, b);

         sc.close();
    }
}
