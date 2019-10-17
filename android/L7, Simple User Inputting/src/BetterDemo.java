import java.util.Scanner;

public class BetterDemo {

	public static void main(String[] args) {

		Scanner myScan;
		myScan = new Scanner(System.in);

		// fist question
		System.out.println("Answer all the questions");
		System.out.println("Life? The Universe? Everything? (It's a number)");
		int ans1 = myScan.nextInt();

		while (ans1 != (42)) {
			System.out.println("Wrong answer! Try again");
			ans1 = myScan.nextInt();
		}
		System.out.println("Correct! Next Question!");

		// second question
		myScan = new Scanner(System.in);
		
		System.out.println("Answer all the questions");
		System.out.println("What is the greatest force in the universe?");
		String ans2 = myScan.nextLine();

		while (!(ans2.equalsIgnoreCase("Love"))) {
			System.out.println("Wrong answer! Try again");
			ans2 = myScan.nextLine();
		}
		System.out.println("Correct! Next Question!");

		// Third questions
		myScan = new Scanner(System.in);
		
		System.out.println("Answer all the questions");
		System.out.println("Who is Doctor...");
		String ans3 = myScan.nextLine();
		
		while (!(ans3.equals("Who"))) {
			System.out.println("Wrong answer! Try again");
			ans2 = myScan.nextLine();
		}
		System.out.println("Correct! Next Question!");
		
	// Third questions
		myScan = new Scanner(System.in);

		System.out.println("Question 2");
		System.out.println("The future pirate King is...");
		String ans4 = myScan.nextLine();

		while (!(ans4.equals("Monkey D. Luffy"))) {
			System.out.println("Wrong answer! Try again");
			ans3 = myScan.nextLine();
		}
		System.out.println("Correct! Next Question!");
		
//Fourth Question
		myScan = new Scanner(System.in);

		System.out.println("Question 2");
		System.out.println("What fish is nerdy and awesome and comes free with every fault in a star?");
		String ans5 = myScan.nextLine();

		while (!(ans5.equals("Hanklerfish"))) {
			System.out.println("Wrong answer! Try again");
			ans5 = myScan.nextLine();
		}
	//ystem.out.println("Correct! Next Question!");
	}

}
