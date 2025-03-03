import java.util.Scanner;
public class MeanHeight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Declaring an array to store the heights of the players
		double[] height = new double[11];

		//Loop to take input of all 11 heights
		System.out.print("Enter the heights of 11 players: ");
		for(int i=0; i<height.length; i++) {
			height[i] = sc.nextDouble();
		}

		//Calculating sum of all heights
		double sum = 0;
		for(int i=0; i<height.length; i++) {
			sum+=height[i];
		}

		//Calculating the mean height
		double mean = sum/height.length;

		System.out.println("Mean height" + mean);
	}
}
