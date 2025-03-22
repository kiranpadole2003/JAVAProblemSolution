import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character :");
        char ch = sc.next().charAt(0);

        int AsciiValue = (int) ch;

        System.out.println("ASCII value of the " + ch + " is : "+AsciiValue);

        sc.close();
    }
}
