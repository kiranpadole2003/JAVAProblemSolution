import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the annual basic salary: ");
        double salary = sc.nextDouble();

        double tax = 0;

        if(salary < 150000){
            tax = 0;
        }else if(salary > 150000 && salary < 300000) {
            tax = 0.20 * (salary - 150000);
        }else {
            tax = 0.20 * 150000 + 0.30 * (salary - 300000);
        }

        System.out.println("Income Tax to be paid: ₹" + tax);
        sc.close();
    }
}
