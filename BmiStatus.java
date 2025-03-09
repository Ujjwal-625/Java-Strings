import java.util.Scanner;

public class BmiStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = 10; 

        //Take user input for weight (kg) and height (cm)
        double[][] data = new double[people][2]; // First column: weight, Second column: height

        for (int i = 0; i < people; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Step 2 & 3: Compute BMI and status
        String[][] bmiResults = computeBMI(data);

        // Step 4: Display the results
        displayResults(bmiResults);
        
        scanner.close();
    }

    // Method to compute BMI and determine status
    public static String[][] computeBMI(double[][] data) {
        int people = data.length;
        String[][] results = new String[people][4]; // Columns: Height, Weight, BMI, Status

        for (int i = 0; i < people; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100; // Convert cm to meters

            double bmi = Math.round((weight / (height * height)) * 100.0) / 100.0; // Round to 2 decimal places
            String status = getBMIStatus(bmi);

            results[i][0] =  String.valueOf(data[i][1]); // Height in cm
            results[i][1] =  String.valueOf(weight);     // Weight in kg
            results[i][2] =  String.valueOf(bmi);        // BMI
            results[i][3] = status;                            // BMI Status
        }
        return results;
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    // Method to display the BMI results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("\nBMI Results:");

        System.out.println("| Height  | Weight  | BMI   | Status     ");

        for (String[] row : results) {
            System.out.printf("| %-7s | %-7s | %-5s | %-10s \n",
                    row[0], row[1], row[2], row[3]);
        }
    }
}
/*Enter weight (kg) for person 1: 1
Enter height (cm) for person 1: 10
Enter weight (kg) for person 2: 2
Enter height (cm) for person 2: 20
Enter weight (kg) for person 3: 3
Enter height (cm) for person 3: 30
Enter weight (kg) for person 4: 4
Enter height (cm) for person 4: 40
Enter weight (kg) for person 5: 5
Enter height (cm) for person 5: 50
Enter weight (kg) for person 6: 6
Enter height (cm) for person 6: 60
Enter weight (kg) for person 7: 7
Enter height (cm) for person 7: 70
Enter weight (kg) for person 8: 8
Enter height (cm) for person 8: 80
Enter weight (kg) for person 9: 9
Enter height (cm) for person 9: 90
Enter weight (kg) for person 10: 45
Enter height (cm) for person 10: 160

BMI Results:
| Height  | Weight  | BMI   | Status
| 10.0    | 1.0     | 100.0 | Obese
| 20.0    | 2.0     | 50.0  | Obese
| 30.0    | 3.0     | 33.33 | Overweight 
| 40.0    | 4.0     | 25.0  | Overweight
| 50.0    | 5.0     | 20.0  | Normal
| 60.0    | 6.0     | 16.67 | Underweight
| 70.0    | 7.0     | 14.29 | Underweight
| 80.0    | 8.0     | 12.5  | Underweight
| 90.0    | 9.0     | 11.11 | Underweight
| 160.0   | 45.0    | 17.58 | Underweight */