
public class Shaman extends Mage {
	public Shaman(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println(name + " attemps a demonic possession");
	}

	void defend () {
		
		System.out.println(name + " mysteriously disappears");
	}

}
