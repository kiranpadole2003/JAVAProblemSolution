import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Year : ");
        int y = sc.nextInt();

        if(y % 4 == 0  &&  y % 100 == 0  || y % 400 == 0) {
            System.out.println(y + " is a Leap Year.");
        }else {
            System.out.println(y + " is not a Leap Year.");
        }
        sc.close();
    }
}
