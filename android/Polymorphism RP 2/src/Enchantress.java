
public class Enchantress extends Mage {
	public Enchantress(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println(name + " uses seduction.");
	}

	void defend () {
		
		System.out.println(name + " distracts its opponent");
	}
}
