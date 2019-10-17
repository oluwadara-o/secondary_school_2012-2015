import java.util.*;

public class Battleground {

	public static void main(String[] args) {
		
		ArrayList<Character> characterList = new ArrayList<Character>();
		
		characterList.add(new Wizard("Mage"));
		characterList.add(new ArcaneWarrior("ArcaneWarior"));
		characterList.add(new Brute("Brute"));
		characterList.add(new Witch("Maleficent"));
		characterList.add(new Sorcerer ("TheSorcerer"));
		characterList.add(new Alchemist ("TheAlchemist"));
		characterList.add(new Enchantress ("TheEnchantress"));
		characterList.add(new Gladiator ("TheGladiator"));
		characterList.add(new Mentalist ("Sherlock"));
		characterList.add(new Pirate ("CaptainJackSparrow"));
		characterList.add(new Samurai ("SamuraiJack"));
		characterList.add(new Shaman ("TheShaman"));
		
		
		while (characterList.size()>1){
			System.out.printf("%d Contestants left\n", characterList.size());
			Character c1=    characterList.get((int) (Math.random()*characterList.size()));
			Character c2=    characterList.get((int) (Math.random()*characterList.size()));
			
			//System.out.printf("c1 = %s c2=%s, are they equal? %b\n", c1.getName(), c2.getName(), c1==c2);
			if (!c1.equals(c2)){
				  characterList.remove(fight(c1,c2));
			}

		}
					
	}


		
	
	static Character fight(Character c1, Character c2) {
		System.out.println("Character 1 is " + c1.getName());
		c1.boast();
		System.out.println("Character 2 is " + c2.getName());
		c2.boast();
		c1.attack();
		c2.defend();
		System.out.println("Check 2!");
		if (c1.attackStrength > c2.defenseStrength) {
			System.out.printf("%s wins!\n", c1.getName());
			return c2;

		} else {
		  System.out.printf("%s wins!\n", c2.getName());
		  return c1; 
		}
	}
	
	



}
