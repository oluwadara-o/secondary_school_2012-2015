import java.util.Scanner;

public class Lesson9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Choose your fate");
		System.out.println("Left or [Right]");
		String direction = input.nextLine();
		
		switch (direction) {
		
		default:
			System.out.println("You could choose Left or Right");
			System.out.println("You were petrified in fear as one of the dogs loomed closer");
			System.out.println("Game Over");
		
		case "Left":
			System.out.println("You make it safely to school and have a boring uneventful day");
			break;
		
		case "Right":
			System.out.println("Suddenly a pack of wild dogs appear and "
					+ "and you have only a stick to defend yourself");
			System.out.println("What will you do next?");
			System.out.println("Choose Attack or Run away");
			String choice = input.nextLine();

			switch (choice) {
			
			default:
				System.out.println("You can only really choose to Attack or Run away");
				break;
				
			case "Attack":
				System.out
						.println("You only make the dogs angrier \n one of them charges");
				System.out.println("What now?!");

				String choice2 = input.nextLine();
				switch (choice2) {
				case "Attack":
					System.out
							.println("You manage to hit one of the dogs on the muzzle "
									+ "\n the others run away scared");
					break;

				case "Run away":
					System.out.println("The dogs are faster! You die!");
					break;
				}
				break;

			case "Run away":
				System.out
						.println("You make it to school but the dogs still follow");
				System.out.println("What will you do?");
				
				String choice3 sssss
				}
				
				break;
			}

		}

	}

}
