import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Find the count of digits in the number
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store the digits of the number in an array
        int[] digits = new int[count];
        temp = num;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Create an array to store the elements in reverse order
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Display the elements in reverse order
        System.out.print("Reversed number: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }

    }
}
