import java.util.Scanner;


public class Loops {


	public static void main(String[] args) {
		Scanner myScan = new Scanner (System.in);
		System.out.println("What is the coulour of your soul?");
		String name = myScan.nextLine();
		
		while (!name.isEmpty()){
			System.out.println("So it's " + name);
			System.out.println ("But what is the colour of your soul?");
			name = myScan.nextLine();
		}
		System.out.println("Ahh the colour of emptiness");

	}

}
