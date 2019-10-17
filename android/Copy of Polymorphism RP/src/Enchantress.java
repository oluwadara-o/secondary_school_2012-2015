
public class Enchantress extends Mage {
	public Enchantress(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println("Seduct");
	}

	void defend () {
		
		System.out.println("Distract");
	}
}
