
public class Mentalist extends Mage{
	public Mentalist(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println("Deduce");
	}

	void defend () {
		
		System.out.println("Insult");
	}

}
