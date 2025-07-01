import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Validate number of subjects
        do {
            System.out.print("Enter number of subjects (greater than 0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Invalid input! Number of subjects must be greater than 0.\n");
            }
        } while (n <= 0);

        int total = 0;

        for (int i = 1; i <= n; i++) {
            int marks;
            // Validate marks for each subject
            do {
                System.out.print("Enter marks for subject " + i + " (0 to 100): ");
                marks = scanner.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks! Please enter between 0 and 100.\n");
                }
            } while (marks < 0 || marks > 100);

            total += marks;
        }

        double average = total / (double) n;
        char grade;

        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}