import java.util.Scanner;

public class Application {
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Ask for user input
		System.out.println("What's your name?");
		
		//Wait for prompt
		String name = input.nextLine();
		
		//produce output
		System.out.print("Hello " + name);
		System.out.println("! My name is... \n completly irrelevant");
		
		System.out.println("I wonder how old you are " +name );	
		
		int age= input.nextInt();
		
		System.out.print("WOW! you're " + age);
		System.out.println(" and you're stupid enough to give a random " +
				"program your details?");
		
		System.out.println("Congratulations you have won life");
		
	}
	

}
