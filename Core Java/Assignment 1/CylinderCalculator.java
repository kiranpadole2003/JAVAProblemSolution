import java.util.Scanner;
public class CylinderCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cyclinder: ");
        double r = sc.nextDouble();

        System.out.print("Enter the Height of the cylinder: ");
        double h = sc.nextDouble();

        double surfaceArea = 2 * Math.PI * r * (r + h);
        double volume = Math.PI * r * r * h;

        System.out.printf("Surface Area of Cylinder is %.2f\n",surfaceArea);
        System.out.printf("Volume of the Cylinder is %.2f",volume);
        sc.close();

    }
}
