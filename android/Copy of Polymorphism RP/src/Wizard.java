
public class Wizard extends Mage {
	
	public Wizard(String myName) {
		attackStrength = 9;
		defenseStrength = 5;
		name= myName;
	}
	
	void attack() {
		System.out.println("Attack");
	}

	void defend () {
		System.out.println("Use Sheild");
	}
}
