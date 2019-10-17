
public class Witch extends Mage{
	public Witch(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println("Poisoned Apple");
	}

	void defend () {
		
		System.out.println("Transform");
	}

}
