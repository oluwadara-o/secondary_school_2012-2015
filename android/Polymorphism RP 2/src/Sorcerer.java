
public class Sorcerer extends Mage{
	public Sorcerer(String myName) {
		attackStrength = (int) (Math.random() *10);
		defenseStrength = (int) (Math.random() *10);
		name= myName;
	}
	
	void attack() {
		System.out.println(name + " curses at its opponent.");
	}

	void defend () {
		
		System.out.println(name + " teleports away from the battlegroud");
	}
}
