
package IntroToStacks;

import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> intro = new Stack<Double>();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			intro.push(Math.random() * 100);
		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String firstNumber = JOptionPane.showInputDialog("Enter a number between 0 and 100");
		String secondNumber = JOptionPane.showInputDialog("Enter in a second number between 0 and 100");
		double firstNumberDouble = Double.parseDouble(firstNumber);
		double secondNumberDouble = Double.parseDouble(secondNumber);
		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.
		if (!intro.isEmpty()) {
			double blech = intro.pop();
			if ((blech > firstNumberDouble && blech < secondNumberDouble) || (blech < firstNumberDouble && blech > secondNumberDouble)) {
				System.out.println(blech);
			}
		}
		
		

		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
