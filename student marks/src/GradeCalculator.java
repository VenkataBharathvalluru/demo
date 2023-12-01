import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();
        scanner.close();

        char grade;

        if (marks > 100) {
            grade = 'I'; // Invalid
        } else if (marks > 95) {
            grade = 'O';
        } else if (marks > 85) {
            grade = 'A';
        } else if (marks > 70) {
            grade = 'B';
        } else if (marks > 60) {
            grade = 'C';
        } else if (marks > 45) {
            grade = 'D';
        } else if (marks > 35) {
            grade = 'P';
        } else if (marks >= 0) {
            grade = 'F';
        } else {
            grade = 'I'; // Invalid
        }

        System.out.println("The student's grade is: " + grade);
    }
}