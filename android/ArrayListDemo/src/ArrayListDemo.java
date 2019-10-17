
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {

      ArrayList<Dog> arrayList = new ArrayList<Dog>();
      
      arrayList.add(new Dog("Gnasher"));
      arrayList.add(new Dog("Spot"));
      
      for(Dog d:arrayList){
    	  d.bark();
      }
      

	}

}
