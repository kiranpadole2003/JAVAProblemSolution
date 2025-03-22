import java.util.Scanner;

public class QuadrantFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the X Coordinate : ");
        int x = sc.nextInt();

        System.out.print("Enter the Y Coordinate : ");
        int y = sc.nextInt();

        if(x > 0 && y > 0) {
            System.out.println("The Point (" + x + ", " + y + ") lies in Quadrant 1");
        } else if (x < 0 && y > 0) {
            System.out.println("The Point (" + x + ", " + y + ") lies in Quadrant 2");
        } else if (x < 0 && y < 0) {
            System.out.println("The Point (" + x + ", " + y + ") lies in Quadrant 3");
        } else if(x > 0 && y < 0) {
            System.out.println("The Point (" + x + ", " + y + ") lies in Quadrant 4");
        } else if(x == 0 && y == 0){
            System.out.println("The Point (" + x + ", " + y + ") lies on origin");
        } else if(x == 0) {
            System.out.println("The Point (" + x + ", " + y + ") lies at the Y-axis");
        } else if(y == 0) {
            System.out.println("The Point (" + x + ", " + y + ") lies at the X-axis");
        }
        sc.close();
    }
}
