public class Gladiator extends Warrior {
	public Gladiator(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println("Slash Sword");
	}

	void defend () {
		
		System.out.println("Sheild");
	}


}
