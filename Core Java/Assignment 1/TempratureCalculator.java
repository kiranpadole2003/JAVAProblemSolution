import java.util.Scanner;
public class TempratureCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temprature in fahrenheit : ");
        double f = sc.nextDouble();

        double celcius = 5 / 9 * (f - 32);
        double kelvin = celcius + 273.15;

        System.out.println("Temprature in celcius : "+celcius);
        System.out.println("Temprature in kelvin : "+kelvin);

        sc.close();
    }
}

