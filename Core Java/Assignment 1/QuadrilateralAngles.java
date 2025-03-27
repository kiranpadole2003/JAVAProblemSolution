public class QuadrilateralAngles {
    public static void main(String[] args) {
        int totalSum = 360;

        int totalRatio = 3+4+5+6;

        int units = totalSum / totalRatio;

        int angle1 = 3 * units;
        int angle2 = 4 * units;
        int angle3 = 5 * units;
        int angle4 = 6 * units;

        System.out.println("Angle 1 :"+ angle1 + " degree");
        System.out.println("Angle 2 :"+ angle2 + " degree");
        System.out.println("Angle 3 :"+ angle3 + " degree");
        System.out.println("Angle 4 :"+ angle4 + " degree");

    }
}
