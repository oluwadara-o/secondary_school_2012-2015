
public class Shaman extends Mage {
	public Shaman(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println("Demonic Possession");
	}

	void defend () {
		
		System.out.println("Disappear");
	}

}
