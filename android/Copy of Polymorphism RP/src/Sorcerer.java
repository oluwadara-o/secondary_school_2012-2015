
public class Sorcerer extends Mage{
	public Sorcerer(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println("Curse");
	}

	void defend () {
		
		System.out.println("Teleport");
	}
}
