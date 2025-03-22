import java.util.Scanner;

public class CylinderCalulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a radius of the cylinder :");
        double r = sc.nextDouble();

        System.out.println("Enter the height of the cylinder :");
        double h = sc.nextDouble();

        double SurfaceArea = ((2 * Math.PI * r * r) + (2 * 3.14 * r * h));
        double Volume = Math.PI * r * r * h;

        System.out.printf("Surface Area of the cylinder is %.2f \n",SurfaceArea);
        System.out.println("Volume of the Cylinder : "+Volume);

        sc.close();
    }
}
