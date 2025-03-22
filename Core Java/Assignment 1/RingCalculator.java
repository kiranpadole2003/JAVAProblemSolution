import java.util.Scanner;
public class RingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the outer radius : ");
        double a = sc.nextDouble();

        System.out.print("Enter the inner radius : ");
        double b = sc.nextDouble();

        double Perimeter = 2 * Math.PI * (a + b);
        double area = Math.PI * ((a * a) - (b * b));

        System.out.println("Perimeter of ring :"+Perimeter);
        System.out.println("Area of ring : "+area);

        sc.close();
    }
}


