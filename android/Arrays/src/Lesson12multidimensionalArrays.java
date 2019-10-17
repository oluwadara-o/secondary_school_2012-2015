
public class Lesson12multidimensionalArrays {


	public static void main(String[] args) {
	
		//this is a one dimensional row
		
		int [] values ={3, 6, 9, 12};
		
		System.out.println(values [2]);
		
		System.out.println("dash");

		int [] [] grid ={
				{3, 6, 9,12},
				{4, 8, 12, 16},
				{10, 100, 1000}
		};
		
		System.out.println(grid [1] [1]);
		System.out.println(grid [2] [0]);
		
		for(int row=0; row<grid.length; row++) {
			for (int col=0; col <grid[row].length; col++ ) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
			//new line after every row
		}
		
	
		
		String [][]words =new String [2][3];
		
		words [0] [1] = "Give me cake";
		
/*		String [] [] speech = {
				{Kill, the, dead},
				
		};*/
		
		System.out.println(words [0] [1]);
		
		


	}

}
