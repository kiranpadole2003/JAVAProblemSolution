public class CompetitiveExam {
    public static void main(String[] args) {
        // Total number of questions
        int totalQuestions = 150;

        // Percentage of correct answers for each candidate
        double candidate1Percentage = 80;
        double candidate2Percentage = 72;

        // Calculate the number of correct answers
        int candidate1Correct = (int) ((candidate1Percentage / 100) * totalQuestions);
        int candidate2Correct = (int) ((candidate2Percentage / 100) * totalQuestions);

        // Display the results
        System.out.println("Candidate 1 got " + candidate1Correct + " correct answers.");
        System.out.println("Candidate 2 got " + candidate2Correct + " correct answers.");
    }
}
