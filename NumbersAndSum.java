import java.util.Scanner;
public class NumbersAndSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

                // Declaring an array to store up to 10 double values
		double[] number = new double[10];

		int i=0; // Index for storing values in the array
		System.out.print("Enter the numbers (Enter 0 or any negative number to stop): ");

	        // Loop to take user input until 0 or negative number is entered, or array limit is reached
		while(true){
			number[i] = sc.nextDouble();

			//if user enters 0 or the indexing reaches 9, break the loop
			if(number[i] == 0 || i == 9){
				break;
			}
      	                // If user enters a negative number, replace it with 0 and stop taking input
			else if (number[i] < 0) {
				number[i] = 0;
				break;
			}

			i++;
		}

		for(int index=0; index<number.length; index++) {
			System.out.print(number[index]+" ");
		}

		System.out.println();

		//Calculating the sum of all stored numbers
		double sum = 0;
		for(int index = 0; index < number.length; index++) {
			sum += number[index];
                }

		//Printing total sum of the numbers
		System.out.println("Sum of numbers: " + sum);

	}
}
