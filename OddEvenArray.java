import java.util.*;
public class OddEvenArray{
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Taking input from the user
		int number = sc.nextInt();

		//If the number is not a natural number print error and exit program
		if (number <= 0) {
			System.err.println("Invalid number");
			System.exit(0);
		}

		int[] evenArray = new int[number / 2 + 1];
		int[] oddArray = new int[number / 2 + 1];

		int odd = 0;
		int even = 0;

		for(int i = 1; i <= number; i++) {
			if(i % 2 == 0) {
				evenArray[even] = i;
				even++;
			}
			else {
				oddArray[odd] = i;
				odd++;
			}
		}

		for(int i = 0; i < odd ; i++) {
			System.out.print(oddArray[i] + " ");
		}

		System.out.println();

		for(int i=0; i < even ; i++) {
			System.out.print(evenArray[i] + " ");
		}


	}
}
