import java.util.Scanner;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numSubjects = 5;
        int maxMarksPerSubject = 100;
        int totalMaxMarks = numSubjects * maxMarksPerSubject;

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

            double percentage = (totalMarks / (double) totalMaxMarks) * 100;

            System.out.println("Total aggregate marks: " + totalMarks);
    System.out.println("Percentage marks obtained: " + percentage + "%");

    sc.close();
    }
}
