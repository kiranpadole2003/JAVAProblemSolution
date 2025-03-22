import java.util.Scanner;
public class CuboidCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of cuboid :");
        double l = sc.nextDouble();

        System.out.println("Enter the breadth of cuboid :");
        double b = sc.nextDouble();

        System.out.println("Enter the height of the cuboid :");
        double h = sc.nextDouble();

        double SurfaceArea = 2 * ((l * b) + (l * h) + (b * h));
        double Volume = l * b * h;

        System.out.println("Surface area of the cuboid :"+SurfaceArea);
        System.out.println("Volume Of the Cuboid :" +Volume);

        sc.close();
    }
}


