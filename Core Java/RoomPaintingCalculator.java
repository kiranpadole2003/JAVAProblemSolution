import java.util.Scanner;
public class RoomPaintingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Accept room dimensions
         System.out.print("Enter room length: ");
         double length = sc.nextDouble();
         
         System.out.print("Enter room width: ");
         double width = sc.nextDouble();
         
         System.out.print("Enter room height: ");
         double height = sc.nextDouble();
         
         // Accept door dimensions
         System.out.print("Enter door width: ");
         double doorWidth = sc.nextDouble();
         
         System.out.print("Enter door height: ");
         double doorHeight = sc.nextDouble();
         
         // Accept window dimensions (both windows are the same size)
         System.out.print("Enter window width: ");
         double windowWidth = sc.nextDouble();
         
         System.out.print("Enter window height: ");
         double windowHeight = sc.nextDouble();

         // Calculate total wall area (excluding floor and ceiling)
        double totalWallArea = 2 * (length * height) + 2 * (width * height);

        // Calculate door and window areas
        double doorArea = doorWidth * doorHeight;
        double windowArea = 2 * (windowWidth * windowHeight);

        // Area to be painted (excluding windows and door)
        double paintableArea = totalWallArea - (doorArea + windowArea);
        
        // Area to be whitewashed (ceiling and floor)
        double whitewashArea = length * width * 2;
        
        // Display results
        System.out.println("Total area to be painted: " + paintableArea + " square units");
        System.out.println("Total area to be whitewashed: " + whitewashArea + " square units");

        sc.close();
    }
}
