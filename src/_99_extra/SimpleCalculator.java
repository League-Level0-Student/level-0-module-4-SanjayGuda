package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String	first = JOptionPane.showInputDialog("Type a number here");
		String second = JOptionPane.showInputDialog("Type a number here");
		
		int firstInt =Integer.parseInt(first);
		int secondInt = Integer.parseInt(second);
		
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Division", "Multilplacation", "Subtraction", "Addition" },
				null);
			
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
			if(operation == 3) {
				add(firstInt, secondInt);
			}
			if(operation == 2) {
				sub(firstInt, secondInt);
			}
			if(operation == 1) {
				mul(firstInt, secondInt);
			}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
			static void add(int num1,int num2) {
				int sum = num1+ num2;
				String equa = num1+" + "+num2+" = "+ sum;
			  JOptionPane.showMessageDialog(null, equa );
			}
	// 4. Create similar methods for subtraction, multiplication and division.
			static void sub(int num1,int num2) {
				int sub = num1- num2;
				String equa = num1+" - "+num2+" = "+ sub;
			  JOptionPane.showMessageDialog(null, equa );
			}
			static void mul(int num1,int num2) {
				int mul = num1+ num2;
				String equa = num1+" + "+num2+" = "+ mul;
			  JOptionPane.showMessageDialog(null, equa );
			}
			
			
			
			
			
			
			
			
}