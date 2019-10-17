
public class Character {

	int attackStrength;
	int defenseStrength;
	String name ;
	
	void attack () {
		System.out.println("smack");
	}

	void defend () {
		System.out.println("Dodge");
	}

	void boast () {
		//System.out.println("My name is " + name + " My strength is " + attackStrength + " and my Defense level is " +defendStrength);
		System.out.printf("My name is %s My strength is %d and my Defense level is %d\n", name, attackStrength, defenseStrength);
	}
	
	int getAttack (){
		return attackStrength;
	}
	
	int getDefense () {
		return defenseStrength;
	}
	
	String getName () {
		return name;
	}
}
