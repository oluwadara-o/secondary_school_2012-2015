
public class Samurai extends Warrior{
	public Samurai(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println(name + " initiates the duel");
	}

	void defend () {
		
		System.out.println(name + " honorably withdraws");
	}


}
