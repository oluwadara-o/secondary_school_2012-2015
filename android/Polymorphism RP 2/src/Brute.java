
public class Brute extends Warrior {
	
	Brute (String myName) {
		attackStrength = 10;
		defenseStrength = 4;
		name = myName;
	}

	void attack () {
		System.out.println("Bash");
	}
	
	void defend () {
		System.out.println("Duck");
	}
	
}
