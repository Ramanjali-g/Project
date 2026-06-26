import java.util.Scanner;

public class StudentCGPACalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student CGPA Calculator =====");

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] subjects = new String[n];
        double[] grades = new double[n];

        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();

            System.out.print("Enter grade point (0-10): ");
            grades[i] = sc.nextDouble();
            sc.nextLine();

            total += grades[i];
        }

        double cgpa = total / n;

        System.out.println("\n========== RESULT ==========");

        double highest = grades[0];
        double lowest = grades[0];
        String highSub = subjects[0];
        String lowSub = subjects[0];

        for (int i = 0; i < n; i++) {
            System.out.println(subjects[i] + " : " + grades[i]);

            if (grades[i] > highest) {
                highest = grades[i];
                highSub = subjects[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
                lowSub = subjects[i];
            }
        }

        System.out.printf("\nCGPA = %.2f\n", cgpa);

        if (cgpa >= 9.0) {
            System.out.println("Grade : O (Outstanding)");
        } else if (cgpa >= 8.0) {
            System.out.println("Grade : A");
        } else if (cgpa >= 7.0) {
            System.out.println("Grade : B");
        } else if (cgpa >= 6.0) {
            System.out.println("Grade : C");
        } else {
            System.out.println("Grade : Needs Improvement");
        }

        System.out.println("\nHighest Scoring Subject : " + highSub + " (" + highest + ")");
        System.out.println("Lowest Scoring Subject  : " + lowSub + " (" + lowest + ")");

        sc.close();
    }
}