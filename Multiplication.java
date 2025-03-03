import java.util.Scanner;
public class Multiplication{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Taking user's input
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

	        // Declaring an array to store multiplication results for 4 values
		int[] multiplication = new int[4];

		int multiply = 6; //Starting multiplication from 6

		//Loop to calculate and store multiplication results
		for(int i=0; i<4; i++){
			multiplication[i]= number * multiply;

			//Printing multiplication statement
			System.out.println(number + " * " + multiply + " = " + multiplication[i]);
			multiply++;
		}
	}
}
