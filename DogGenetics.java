import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
	public static void print(int a) {
		switch(a) {
			case 0:	System.out.println("% St. Bernard");break;
			case 1:	System.out.println("% Chihuahua");break;
			case 2:	System.out.println("% Dramatic RedNosed Asian Pug");break;
			case 3:	System.out.println("% Common Cur");break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		double value= 0;
		double max = 100;
		System.out.println("What is your dog's name? ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Well then, I have this highly reliable report on "+ name+ " prestigious background right here");
				
		for(int i = 0; i<4;i++) {
			double random = 1 + r.nextDouble() * (max - 1);
			max = max - random;
			value = value + random;
			System.out.print(random);
			print(i);
		}
		System.out.println((100-value)+" % King Doberman");
		System.out.println("Wow, that's QUITE the dog!  ");
		
	}

}
