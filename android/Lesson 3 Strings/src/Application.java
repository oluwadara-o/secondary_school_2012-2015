
public class Application {

	public static void main(String[] args) {
	
		String hey = "Hello ";
		//String is a class
		//"hey" is a variable- a reference point for the String
		
		String text = "My name is ";
		String name = "April";
		
		String intro = hey + text + name;
		//concatination
		
		int myNum = 7;
		
		System.out.println(intro);
		
		//concatination (adding strings together)
		System.out.println(hey + text + name);
		System.out.println("I"+" love"+" Music");
		System.out.println("My lucky number is " + myNum);
		System.out.println("I am "+ intro.length());
		
		

	}

}
