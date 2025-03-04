import java.util.Scanner;

public class StudentGrades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Enter user's input
		System.out.print("Enter the number of students: ");
		int students = sc.nextInt();

		//Declaring array for storing marks, percentage and grades
		double[][] marks = new double[students][3];
		double[] percentage = new double[students];
		String[] grades = new String[students];

		//Taking input for marks of Physics, Chemistry and Maths
		for (int i = 0; i < students; i++) {
			System.out.println("\nEnter marks for Student " + (i + 1) + ":");

			System.out.print("Physics: ");
			marks[i][0] = sc.nextDouble();
			System.out.print("Chemistry: ");
			marks[i][1] = sc.nextDouble();
			System.out.print("Maths: ");
			marks[i][2] = sc.nextDouble();

			if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
				System.out.print("Please enter the positve values");
				i--;
				continue;
			}



			double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
			percentage[i] = totalMarks / 3.0;

			//Using condition statements to check the grade
			if (percentage[i] >= 80) {
				grades[i] = "A";
			} else if (percentage[i] >= 70) {
				grades[i] = "B";
			} else if (percentage[i] >= 60) {
				grades[i] = "C";
			} else if (percentage[i] >= 50) {
				grades[i] = "D";
			} else if (percentage[i] >= 40) {
				grades[i] = "E";
			} else {
				grades[i] = "R";
			}
		}

		// Display the results
		System.out.println("\nStudent Grade Report:");

        for (int i = 0; i < students; i++) {
            System.out.println((i + 1) + " Student:\nPhysics: " + marks[i][0] + " Chemistry: " + marks[i][1] + " Maths: " + marks[i][2] +
                    "\nPercentage: " + percentage[i] + "\tGrades: " + grades[i]);
        }

    }
}
