import java.util.Scanner;

public class HealthyHearts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		int max = 220;
		System.out.println("Your maximum heart rate should be "+ (max - age) + " beats per minute");
		System.out.println("Your maximum heart rate should be "+((max - age)*0.5)+"-"+((max - age)*0.85)+" beats per minute");
	}

}
