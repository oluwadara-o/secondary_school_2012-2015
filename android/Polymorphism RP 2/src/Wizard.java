
public class Wizard extends Mage {
	
	public Wizard(String myName) {
		attackStrength = 9;
		defenseStrength = 5;
		name= myName;
	}
	
	void attack() {
		System.out.println(name + " waves its wand");
	}

	void defend () {
		System.out.println(name + " throws its wand at the opponent");
	}
}
