import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of the Circle:");
        double r = sc.nextDouble();

        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.printf("Circumference of the circle : %.2f\n",circumference);
        System.out.printf("Area of the circle : %.2f",area);
        sc.close();
    }
}