public class Application {
	public static void main(String[] args) {

		System.out.println("Who Killed Sherlock?");

		int deathCount = 1;

		String wrong = "\n Guess Again John";

		while (deathCount < 10) {
			switch(deathCount){
			case 4:
				System.out.println("It was Molly" + wrong);
				break;
			case 5:
				System.out.println("It was Fred" + wrong);
				break;
			}
			//System.out.println("deathCount=" + deathCount);
			deathCount++;
		}

		System.out.println("Sherlock's alive!");

		
	}

}
