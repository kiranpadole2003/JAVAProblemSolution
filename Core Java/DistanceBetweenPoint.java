import java.util.Scanner;
public class DistanceBetweenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the X1 :");
        double X1 = sc.nextDouble();

        System.out.println("Enter the X2 :");
        double X2 = sc.nextDouble();

        System.out.println("Enter Y1 :");
        double Y1 = sc.nextDouble();

        System.out.println("Enter Y2 :");
        double Y2 = sc.nextDouble();

        double d = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));

        System.out.println("Distance between two points is : "+d);
        sc.close();
    }
}
