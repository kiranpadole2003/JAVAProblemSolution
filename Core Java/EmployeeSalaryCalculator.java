import java.util.Scanner;
public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = sc.nextInt();

        System.out.print("Enter Basic Salary : ");
        double basicSalary = sc.nextDouble();

        double houseRentAllowance = 0.10 * basicSalary;
        double dearnessAllowance = 0.30 * basicSalary;
        double professionalTax = 0.05 * basicSalary;

        double grossSalary = basicSalary + houseRentAllowance + dearnessAllowance;
        double takeHomeSalary = grossSalary - professionalTax;

        System.out.println("\nEmployee ID: " +employeeId);
        System.out.println("Basic Salary: " +basicSalary);
        System.out.println("House Rent Allowance (10%): " +houseRentAllowance);
        System.out.println("Dearness Allowance (30%): " +dearnessAllowance);
        System.out.println("Professional Tax Deduction (5%): " +professionalTax);
        System.out.println("Gross Salary: " +grossSalary);
        System.out.println("Take Home Salary: " +takeHomeSalary);

        sc.close();
    }
}
