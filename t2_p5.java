import java.util.Scanner;

public class t2_p5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        // Define the number of subjects
        int Sub = 5; // Change this to the number of subjects you have

        // Create arrays to store marks and subject names
        int[] marks = new int[Sub];
        String[] subjects = {"Math", "Science", "English", "History", "Geography"}; // Customize subject names

        // Take input for each subject
        for (int i = 0; i < Sub; i++) {
            System.out.print("Enter marks obtained in " + subjects[i] + " (out of 100): ");
            
            // Input validation for integer values
            while (!sn.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer value.");
                sn.next(); // Clear the invalid input
                System.out.print("Enter marks obtained in " + subjects[i] + " (out of 100): ");
            }
            
            // Read the marks and validate them
            marks[i] = sn.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                i--; // Decrement index to re-enter the marks for this subject
            }
        }

        // Close the scanner
        sn.close();

        // Calculate total marks
        int totalM = 0;
        for (int mark : marks) {
            totalM += mark;
        }

        // Calculate average percentage
        double multi = Sub * 100.0; // Total possible marks (each subject out of 100)
        double average = (totalM / multi) * 100.0;

        // Determine grade based on average percentage
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Marks obtained in each subject:");
        for (int i = 0; i < Sub; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        
        System.out.println("----------------");
        System.out.println("Total Marks: " + totalM);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("----------------");
    }
}
