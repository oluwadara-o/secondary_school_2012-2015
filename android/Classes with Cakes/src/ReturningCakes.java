class Person{
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is" + name);
		System.out.println("I am" + age + "years old");
		
	}
	
	int YearsLeftToLive () {
		int yearsLeft = 100 - age;
		return yearsLeft;

	}
	

	
	
}


public class ReturningCakes {
	public static void main (String[]args){
		Person person1 = new Person ();
		
		person1.name="Alicia";
		person1.age = 21;
		
		person1.speak();
		
		int years = person1.YearsLeftToLive();
		
		System.out.println("I will be terminated in"+ years + "years");
		
		
		
	}
}
