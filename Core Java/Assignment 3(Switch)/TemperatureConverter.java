import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int choice;
        double temprature, converted;

        do {
            System.out.println("\n======= Temperature Conversion Menu ======");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Farenheit to Celcius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Exit");
            System.out.println("Enter your Choice (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter temperature in Celcius: ");
                    temprature = sc.nextDouble();
                    converted = (temprature * 9/5) + 32;
                    System.out.println("Fahrenheit: " +converted);
                    break;

                case 2:
                    System.out.println("Enter temperature in Fahrenheit: ");
                    temprature = sc.nextDouble();
                    converted = (temprature - 32) * 5/9;
                    System.out.println("Celcius: " +converted);
                    break;

                case 3:
                    System.out.println("Enter temperature in Celcius: ");
                    temprature = sc.nextDouble();
                    converted = (temprature + 273.15);
                    System.out.println("Kelvin: " +converted);
                    break;

                case 4:
                    System.out.println("Enter temperature in Kelvin: ");
                    temprature = sc.nextDouble();
                    converted = (temprature - 273.15);
                    System.out.println("Celcius: " +converted);
                    break;

                case 5:
                    System.out.println("Exiting the program. Thank You!");
                    break;
            
                default:
                System.out.println("Invalid choice. Please try again.");
                    break;
            } 
        }while (choice != 5);
        sc.close();
    }
}
