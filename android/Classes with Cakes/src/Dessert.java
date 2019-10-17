
public class Dessert {
	
	//Classes are like variables int, double etc.
	//Classes can contain data
	//Subrotines i.e. meathod like themainmethod
	
	private String name;
	private String flavour;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//somesubrourines
	void speak () {
		System.out.println("I am a " + flavour + " " + name );
	}
	
	//data9

}
