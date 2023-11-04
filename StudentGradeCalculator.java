import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double average = (double) totalMarks / numSubjects;
        double percentage = (average / 100) * 100; // Assuming maximum marks for each subject is 100.

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");

        // Determine the grade based on the percentage
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
