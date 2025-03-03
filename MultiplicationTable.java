import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number for the multiplication table: ");
		int number = sc.nextInt(); //Taking user's input

		//Declaring and initializing the array
		int[] table = new int[10];

		//Using for-loop to get the multiplication table
		for(int i=1; i<=10; i++) {
			table[i-1] = number * i;
			System.out.println(number + " * " + i + " = " + table[i-1]);
		}
	}
}
