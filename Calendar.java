import java.util.*;

class Calendar {
    // Array to store month names
    private static final String[] months = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for month and year
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Get the number of days in the month
        int numDays = getDaysInMonth(month, year);

        // Print the calendar
        printCalendar(month, year, firstDay, numDays);
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;  // February in a leap year
        }
        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month using Gregorian Calendar Algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;  // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year, int firstDay, int numDays) {
        System.out.printf("\n   %s %d\n", months[month - 1], year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first row
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print days of the month
        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();  // Move to the next line after Saturday
            }
        }
        System.out.println(); // Print a new line at the end
    }
}
 /*Enter month (1-12): 12
Enter year: 2003

   December 2003
 Sun Mon Tue Wed Thu Fri Sat
       1   2   3   4   5   6
   7   8   9  10  11  12  13
  14  15  16  17  18  19  20
  21  22  23  24  25  26  27
  28  29  30  31
   */