import java.util.Scanner;

public class AreaVolumeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius :");
        double r = sc.nextDouble();

        System.out.println("Enter the Operation :");
        System.out.println("1. Area of circle");
        System.out.println("2.Circumference of circle");
        System.out.println("Volume of Sphere");

        System.out.println("Enter the choice(1-3):");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                double area = Math.PI * r * r;
                System.out.println("Area of the Circle :" + area);
                break;

            case 2:
                double cir = 2 * Math.PI * r;
                System.out.println("Circumference of the circle :" +cir);
                break;

            case 3:
               double volume = 4.0/3.0 * Math.PI * Math.pow(r, 3);
               System.out.println("Volume of the sphere :" + volume);
               break;
        
            default:
                break;
        }
        sc.close();
    }
}
