import java.util.Scanner;

public class t2_p1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        // Define the number of subjects
        int Sub = 5; // Change this to the number of subjects you have

        // Create an array to store marks
        int[] marks = new int[Sub];
        String[] subjects = {"Math", "Science", "English", "History", "Geography"}; // Customize subject names

        // Take input for each subject
        for (int i = 0; i < Sub; i++) {
            System.out.print("Enter marks obtained in " + subjects[i] + " (out of 100): ");
            while (!sn.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer value.");
                sn.next(); // Clear the invalid input
                System.out.print("Enter marks obtained in " + subjects[i] + " (out of 100): ");
            }
            marks[i] = sn.nextInt();

            // Validate the entered marks
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks. Marks should be between 0 and 100.");
                i--; // Decrement index to re-enter the marks for this subject
            }
        }


        // Display the entered marks
        System.out.println("\nMarks obtained in each subject:");
        for (int i = 0; i < Sub; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        sn.close();
    }
}
