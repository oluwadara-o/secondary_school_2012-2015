
public class Alchemist extends Mage {
	public Alchemist(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println(name + " uses Mida's Touch");
	}

	void defend () {
		
		System.out.println(name + " charm's its opponent.");
	}

}
