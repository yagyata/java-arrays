import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking if the input is valid
        if (number <= 0) {
            System.err.println("Invalid number. Enter a positive integer.");
            System.exit(0);
        }

        // Initial array size and index for storing factors
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Finding factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // Check if 'i' is a factor
                // Resize the array if full
                if (index == maxFactor) {
                    maxFactor *= 2;  // Double the array size
                    int[] temp = new int[maxFactor];  // Create a larger array
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy old factors
                    factors = temp;  // Assign the new array
                }
                factors[index] = i;  // Store the factor
                index++;  // Move to the next index
            }
        }

        // Printing the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

    }
}

