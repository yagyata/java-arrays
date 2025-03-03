import java.util.Scanner;
public class MathematicalOperations{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];

		//Taking five inputs from user using for-loop
		System.out.println("Enter five numbers: ");
		for(int i=0; i<number.length; i++) {
			number[i] = sc.nextInt();
		}

		//Implementing a for-loop through out the array to do the operations
		for(int i=0; i<number.length; i++) {
			if (number[i] > 0) { //The condition to check Positive number
				System.out.print ("Positive ");

				if (number[i] % 2 == 0) { //Condition to check if the number is even
					System.out.println("Even");
				}
				else {  //Executed if above conditons are not satisfied
					System.out.println("Odd");
				}

			}
			else if (number[i] < 0) { //Condition to check if the number is negative
				System.out.println("Negative");

			}
			else { //Executed if above conditons are not satisfied
				System.out.println("Zero");
			}
		}

		if (number[0] > number[number.length-1]) { // Checking if first element is greater than last element
			System.out.println("The number "+ number[0] + " is greater than " + number[number.length-1] );
		}
		else if (number[0] < number[number.length-1]) { //Checking if first element is less than last element
                        System.out.println("The number "+ number[0] + " is less than " + number[number.length-1]);
		}
		else {  //Executed if above conditons are not satisfied
			System.out.println("The numbers " + number[0] + " and " + number[number.length-1] + " are equal");
		}

	}
}
