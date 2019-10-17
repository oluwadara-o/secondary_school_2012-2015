import java.util.*;

public class Battleground {

	public static void main(String[] args) {
		
		ArrayList<Character> ca1 = new ArrayList<Character>();
		ArrayList<Character> ca2 = new ArrayList<Character>();
		
		ca1.add(new Wizard("Mage"));
		ca1.add(new ArcaneWarrior("ArcaneWarior"));
		ca1.add(new Brute("Brute"));
		ca1.add(new Witch("Maleficent"));
		ca1.add(new Sorcerer ("TheSorcerer"));
		ca1.add(new Alchemist ("TheAlchemist"));
		ca1.add(new Enchantress ("TheEnchantress"));
		ca1.add(new Gladiator ("TheGladiator"));
		ca1.add(new Mentalist ("Sherlock"));
		ca1.add(new Pirate ("CaptainJackSparrow"));
		ca1.add(new Samurai ("SamuraiJack"));
		ca1.add(new Shaman ("TheShaman"));
		
		ca2.add(new Wizard("Mage"));
		ca2.add(new ArcaneWarrior("ArcaneWarior"));
		ca2.add(new Brute("Brute"));
		ca2.add(new Witch("Maleficent"));
		ca2.add(new Sorcerer ("TheSorcerer"));
		ca2.add(new Alchemist ("TheAlchemist"));
		ca2.add(new Enchantress ("TheEnchantress"));
		ca2.add(new Gladiator ("TheGladiator"));
		ca2.add(new Mentalist ("Sherlock"));
		ca2.add(new Pirate ("CaptainJackSparrow"));
		ca2.add(new Samurai ("SamuraiJack"));
		ca2.add(new Shaman ("TheShaman"));
		
		while ( (ca1.size()>0) & (ca2.size()>0) ){
			System.out.printf("%d Contestants left\n", ca1.size() + ca2.size());
			System.out.println("Player one has " + ca1.size());
			System.out.println("Player two has " + ca2.size());
			Character c1=    ca1.get((int) (Math.random()*ca1.size()));
			Character c2=    ca2.get((int) (Math.random()*ca2.size()));
			
			if (ca1.size()==0){
				System.out.println("Player one loses");
				//return;
			} else if (ca2.size()==0) {
				System.out.println("Player two loses");
				//return;
			} else {
					Character looser = fight(c1,c2);
					if (looser==c1){
						ca1.remove(looser);
					} else{
						ca2.remove(looser);
					}
			}
			
			//System.out.printf("c1 = %s c2=%s, are they equal? %b\n", c1.getName(), c2.getName(), c1==c2);
			/*if (!c1.equals(c2)){
				  ca1.remove(fight(c1,c2));
			}*/

		}
					
	}


		
	
	static Character fight(Character c1, Character c2) {
		System.out.println("Character 1 is " + c1.getName());
		c1.boast();
		System.out.println("Character 2 is " + c2.getName());
		c2.boast();
		c1.attack();
		c2.defend();
		if (c1.attackStrength > c2.defenseStrength) {
			System.out.printf("%s wins!\n", c1.getName());
			return c2;

		} else {
		  System.out.printf("%s wins!\n", c2.getName());
		  return c1; 
		}
	}
	
	



}
