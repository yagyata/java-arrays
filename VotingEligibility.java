import java.util.Scanner;
public class VotingEligibility{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];

		System.out.print("Enter the age of 10 students to check their voting eligibility: ");
		//Taking multiple inputs from user using for loop
		for(int i=0; i<age.length; i++){
			age[i] = sc.nextInt();
		}

		//Checking the eligibility of each student using for loop and using conditional operators
		for(int i=0; i<age.length; i++){
			if (age[i] >= 18) {
				System.out.println("The Student with age " + age[i] + " can vote");
			}
			else if (age[i] < 18) {
				System.out.println("The student with age " + age[i] + " cannot vote");
			}
			else {
			System.err.println("Invalid Age");
			}
		}
	}
}
