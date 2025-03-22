import java.util.Scanner;

public class PreviousNextCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char ch = sc.next().charAt(0);

        System.out.println("The Previous character is :"+(char)(ch - 1));
        System.out.println("The Next Character is :"+(char)(ch + 1));

        sc.close();
    }
}
