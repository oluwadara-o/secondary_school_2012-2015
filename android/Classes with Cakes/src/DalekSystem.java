
class Dalek{
	
	public void speak(String text) {
		System.out.println(text);
		//we need to "catch" the string that we are declaring below 
	}
	
	public void Find (int victims){
		System.out.println(victims + " life forms exteminated");
	}
	
	public void Locate (double distance, String direction){
		System.out.println("Doctor located " + distance + " metres from Dalek Base. In direction " + direction);
	}
}


public class DalekSystem {


	public static void main(String[] args) {
		Dalek Khan = new Dalek ();
		Khan.speak("Exterminate");
		
		Khan.Find(8);
		Khan.Locate (4.2, "South South East");
		
		Khan.speak("Confirmation aplha epislon delta four");
		

	}

}
