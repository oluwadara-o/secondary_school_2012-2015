


public class App {

		public static void main (String[] args){
			
			Dessert desert1 = new Dessert();
			desert1.setFlavour("Vanilla");
			desert1.setName ("Icecream");
			desert1.setId (1);

			Dessert desert2 = new Dessert ();
			desert2.setFlavour ("Chocolate");
			desert2.setName ("Biscuit");
			desert2.setId (2);
			
			//System.out.println(desert1.flavour + " " + desert1.name);
			
			desert1.speak();
			
			
			
		}
		
		
}
