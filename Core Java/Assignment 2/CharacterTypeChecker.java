import java.util.Scanner;

public class CharacterTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character : ");
        char ch = sc.next().charAt(0);

        int asciivalue = (int) ch;

        if(asciivalue >= 48 && asciivalue <= 58){
            System.out.println(ch + " is a digit.");
        }else if(asciivalue >= 65 && asciivalue <= 90) {
            System.out.println(ch + " is a uppercase letter.");
        }else if(asciivalue >=97 && asciivalue <= 122){
            System.out.println(ch + " is a lowercase letter.");
        }else {
            System.out.println("Invalid input or special character.");
        }
        sc.close();
    }
}
