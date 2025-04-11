import java.util.Scanner;

public class QuadraticsEquationRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a :"); //Input three coefficient
        double a = sc.nextDouble();

        System.out.println("Enter the value of b :");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c :");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;     //descriment

        int caseType;
        if(d > 0){
            caseType = 1; //Real and distinct;
        }else if(d == 0){
            caseType = 2;  //Real and equal
        }else{
            caseType = 3;
        }

        switch (caseType) {
            case 1:
                double root1 = (- b + Math.sqrt(d) / 2 * a);
                double root2 = (- b - Math.sqrt(d) / 2 * a);
                System.out.println("Roots are real and distinct");
                System.out.println("Root 1 = "+root1);
                System.out.println("Root 2 = "+root2);
                break;

            case 2:
                double root = -b / (2 * a);
                System.out.println("Roots are real and equal");
                System.out.println("Root : " +root);
                break;

            case 3:
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are Real and Inaginary.");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
                break;

            default:
                break;
        }
        sc.close();
    }
}
