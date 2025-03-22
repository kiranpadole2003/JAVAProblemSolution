import java.util.Scanner;
public class ArithrmaticHarmonicMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int a = sc.nextInt();

        System.out.println("Enter Second Number :");
        int b = sc.nextInt();

        int AM = (a + b) / 2;
        int HM = a * b / (a + b);

        System.out.println("Arithmetic Mean of the two number :"+AM);
        System.out.println("Harmonic Mean of the two number :"+HM);

        sc.close();
    }
}


