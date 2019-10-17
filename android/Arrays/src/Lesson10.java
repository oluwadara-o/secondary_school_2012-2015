
public class Lesson10 {

	public static void main(String[] args) {
		
		//we have already been introduced to intergers which are like
		//buckets that hold whole numbers
		//Arrays however are more like labels to a set of numbers
		
		int aValue = 3;
		System.out.println("Interger value is " + aValue);
		
		int [] moreValues;
		//here we declare the array of morevALUES
		moreValues = new int[3];
		//you can then state how long the array should be
		
		System.out.println(moreValues [1]);
		//you can now recall the individual values in the array.
		//All are initially set to zero
		
		//ok now we set the values of all the intergers
		
		moreValues [0] = 1;
		moreValues [1] = 3;
		moreValues [2] = 4;
		//Arrays start numbering at 0! so the third number is 2
		
		for (int i=0; i < moreValues.length; i++) {
			System.out.println("The value of 'i' is" + moreValues[i]);
		}
		//above is a method to get back ALL the numbers in an array :)
		//the loop repeats until  i it is greater than the length of the loop
		
		//we could also set the values in an array in one line
		
		int [] numbers ={42, 81, 121};
		//you can also declare a new array as well as set them numbers on one line
		
		
		
			


	}

}
