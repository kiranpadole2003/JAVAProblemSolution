import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Side :");
        double a = sc.nextDouble();

        System.out.println("Enter Second Side :");
        double b = sc.nextDouble();

        System.out.println("Enter Third Side :");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && c + b > a){
            double s = (a + b + c) / 2;

            double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of Triangle : "+A);
        }
        sc.close();
    }
}
