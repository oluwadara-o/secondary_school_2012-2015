
public class Pirate extends Warrior {
	public Pirate(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println(name + " fires a cannon");
	}

	void defend () {
		
		System.out.println(name +" sails away");
	}

}
