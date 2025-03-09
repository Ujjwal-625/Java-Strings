import java.util.*;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int students = sc.nextInt(); // You can change the number of students

        // Step 1: Generate random scores
        int[][] scores = generateScores(students);

        // Step 2: Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Step 3: Assign grades based on percentage
        String[] grades = assignGrades(results);

        // Step 4: Display the scorecard
        displayScorecard(scores, results, grades);
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random()*91) + 10; // Random number between 10 and 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; // Columns: Total, Average, Percentage

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0; // Round to 2 decimal places

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to assign grades based on percentage
    public static String[] assignGrades(double[][] results) {
        int students = results.length;
        String[] grades = new String[students];

        for (int i = 0; i < students; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Method to display scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.println("| Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade |");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("| %-7d | %-7d | %-7d | %-7d | %-5.0f | %-7.2f | %-10.2f | %-5s |\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }
}
/*Enter the number of students: 
3 

Student Scorecard:
| Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade |
| 1       | 28      | 37      | 29      | 94    | 31.33   | 31.33      | R     |
| 2       | 27      | 90      | 68      | 185   | 61.67   | 61.67      | C     |
| 3       | 85      | 23      | 18      | 126   | 42.00   | 42.00      | E     | */
