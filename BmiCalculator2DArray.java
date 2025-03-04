import java.util.Scanner;
public class BmiCalculator2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of people to check the BMI: ");
		int number = sc.nextInt();

	 	// Multi-dimensional array to store height, weight, and BMI
        	double[][] personData = new double[number][3];
	        String[] weightStatus = new String[number];

        	// Taking input for weight and height
	        for (int i = 0; i < number; i++) {
        	    System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
        	    personData[i][0] = sc.nextDouble();
	            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
	    	    personData[i][1] = sc.nextDouble();

	            // Calculating BMI
        	    personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

	            // Determining weight status
        	    if (personData[i][2] < 18.5)
                    weightStatus[i] = "Underweight";
	            else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9)
	            weightStatus[i] = "Normal weight";
	            else if (personData[i][2] >= 25 && personData[i][2] < 29.9)
        	    weightStatus[i] = "Overweight";
	            else
	            weightStatus[i] = "Obese";
        	}

	        // Displaying results
        	System.out.println("\nDetails of all individuals:");
        	for (int i = 0; i < number; i++) {
        		System.out.println("Person " + (i + 1) + ": Height = " + personData[i][0] + " m, Weight = " + personData[i][1] + " kg, BMI = " + String.format("%.2f", personData[i][2]) + ", Status = " + weightStatus[i]);
        	}

	}
}
