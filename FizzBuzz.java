import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // If input is not a positive number, exit the program
        if (number <= 0) {
            System.err.println("Invalid input! Enter a positive integer.");
            System.exit(0);
        }

        // Create a String array to store results
        String[] results = new String[number + 1];

        // Loop from 0 to number and apply FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            }
	    else if (i % 3 == 0) {
                results[i] = "Fizz";
            }
	    else if (i % 5 == 0) {
                results[i] = "Buzz";
            }
	    else {
                results[i] = String.valueOf(i); // Convert number to String
            }
        }

        // Print the results with index positions
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

    }
}
