import java.util.Random;
import java.util.Scanner;
//ready to push
/*
 * Requirements
This program will be a Java Console Application called RockPaperScissors.

The program first asks the user how many rounds he/she wants to play.
Maximum number of rounds = 10, minimum number of rounds = 1.  If the user asks for something outside this range, the program prints an error message and quits.
If the number of rounds is in range, the program plays that number of rounds.  Each round is played according to the requirements below.
For each round of Rock, Paper, Scissors, the program does the following:
The computer asks the user for his/her choice (Rock, Paper, or Scissors).
Hint: 1 = Rock, 2 = Paper, 3 = Scissors
After the computer asks for the user’s input, the computer randomly chooses Rock, Paper, or Scissors and displays the result of the round (tie, user win, or computer win).
Hint: use the Random class.
The program must keep track of how many rounds are ties, user wins, or computer wins.
Hint: Create three variables to keep track of these items and update them correctly after each round.
The program must print out the number of ties, user wins, and computer wins and declare the overall winner based on who won more rounds.
After all rounds have been played and the winner declared, the program must ask the user if he/she wants to play again.
If the user says No, the program prints out a message saying, “Thanks for playing!” and then exits.
If the user says Yes, the program starts over, asking the user how many rounds he/she would like to play.
 */

public class RockPaperScissors {
	public static int checkWin(int computer, int player) {
		//1 = Rock, 2 = Paper, 3 = Scissors
		if((computer==1 && player ==3) ||(computer==2 && player == 1)||(computer ==3 && player == 2)) {
			System.out.println("I win");
			return 1;
		}else if((computer==2 && player ==2) ||(computer==1 && player == 1)||(computer ==3 && player == 3)) {
			System.out.println("it's a draw");
			return 3;
		}else{
			System.out.println("you win");
			return 2;
		}
	}
	public static void displayplayer(int a) {
		switch(a){
		case 1 :System.out.println("you choice rock");break;
		case 2 :System.out.println("you choice paper");break;
		case 3 :System.out.println("you choice scissors");break;
		default: System.out.println("wrong range, please give me a number again");break;
		}

	}
	
		public static void displaycomputer(int a) {
			switch(a){
			case 1 :System.out.println("I choice rock");break;
			case 2 :System.out.println("I choice paper");break;
			case 3 :System.out.println("I choice scissors");break;
			default: System.out.println("system error");break;
			}

		}
		public static boolean askplay(String a) {
			switch(a){
			case "yes" :return true;
			case "Yes" :return true;
			case "no" :return false;
			case "No" :return false;
			}
			return false;

		}
		
	public static void main(String[] args) {
		boolean countin = true;
		int round ;
		int inputnumber;
		Random rng = new Random();
		Scanner input = new Scanner(System.in);
		int check ;
		do {//first play round loop
			int playerWin =0;
			int cpWin =0;
			do {
				
				System.out.println("please give me the round you want to play from 1 to 10");
				System.out.println("-------------------------------------------");

				round = input.nextInt();
				if(round<0 || round>11) {
					
					System.out.println("wrong range, please give me a number again");
					System.out.println("-------------------------------------------");

				}
			}while(round<0 && round>11);
			System.out.println("the game has stated now ,you will play with me for "+ round +" round");
			System.out.println("-------------------------------------------");

			for(int i = 1;i<round+1;i++) {
				
				System.out.println("this is round "+i+" give me you input 1 = Rock, 2 = Paper, 3 = Scissors");
				System.out.println("-------------------------------------------");

				do{
					inputnumber = input.nextInt();
					displayplayer(inputnumber);
					}
				while(inputnumber<0 && inputnumber >4);
				int randomNumber = rng.nextInt(3)+1;
				displaycomputer(randomNumber);
				check = checkWin(randomNumber,inputnumber);
				switch(check) {
					case 1: cpWin++;break;
					case 2: playerWin++;break;
				}
				System.out.println("this round end, you have won "+playerWin+" times. I have won "+ cpWin+ " times.");
				System.out.println("-------------------------------------------");

			}
			System.out.println("-------------------------------------------");
			if(cpWin>playerWin) {
				System.out.println("I have won "+(cpWin-playerWin)+" times than you, I win");
			}else if(cpWin==playerWin) {
				System.out.println("the score are draw");
				
			}else {
				System.out.println("you have won "+(playerWin-cpWin)+"more times , you win");
			}
			System.out.println("-------------------------------------------");

			System.out.println("do you want to play again? type in yes or no");
			String askPlay = input.next();
			countin=askplay(askPlay);
		}while(countin==true);
		System.out.println("thanks for playing, see you in next game");
	}
		
}
