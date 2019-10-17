import javax.swing.JFrame;


public class helloSwing {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Hello World");
//make a window
		frame.setVisible(true);
		
//see the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Hello Java Swing");
		frame.setSize(1000, 700);

		
//xtra internet suff
		//3. Create components and put them in the frame.
		//...create emptyLabel...
		//frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);


	}

}
