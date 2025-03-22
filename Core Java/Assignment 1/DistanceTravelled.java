import java.util.Scanner;
public class DistanceTravelled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Initial Velocity : ");
        double u = sc.nextDouble();

        System.out.print("Acceralation : ");
        double a = sc.nextDouble();

        System.out.print("Time : ");
        double t = sc.nextDouble();

        double v = u + (a * t);
        double d = u + (a * (t * t));

        System.out.println("Velocity : "+v);
        System.out.println("Distance travelled : "+d);

        sc.close();
    }
}


