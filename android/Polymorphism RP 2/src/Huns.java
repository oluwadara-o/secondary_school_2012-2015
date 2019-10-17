
public class Huns extends Warrior{
	public Huns(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println("Grunt");
	}

	void defend () {
		
		System.out.println("Take shelter");
	}

}
