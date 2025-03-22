import java.util.Scanner;
public class Reactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length and breadth of rectangle : ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        double Area = l * b;
        double Perimeter = 2 * (l + b);

        System.out.printf("Area of reactangle : %.2f\n",Area);
        System.out.printf("Perimeter of reactangle : %.2f",Perimeter);
        sc.close();
    }
}
