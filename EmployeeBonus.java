import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EMP_COUNT = 10;

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        System.out.println("Enter salary and years of service for " + EMP_COUNT + " employees:");

        for (int i = 1; i <= EMP_COUNT; i++) {
            double salary, years;

            // Input validation
            while (true) {
                System.out.print("Employee " + i + " - Salary: ");
                salary = sc.nextDouble();
                System.out.print("Employee " + i + " - Years of Service: ");
                years = sc.nextDouble();

                if (salary > 0 && years >= 0) break;
                System.err.println("Invalid input! Salary must be positive and years cannot be negative.");
            }

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

    }
}
