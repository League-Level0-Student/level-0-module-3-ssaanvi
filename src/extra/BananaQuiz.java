//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String name = JOptionPane.showInputDialog("Dear user, what is your name?");
		String like = JOptionPane
				.showInputDialog("Okay. " + name + ", let's start the banana quiz!!! Do you like banana's?");
		// 2. if they say no,
		// tell them they are crazy
		if (like.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy.");

		}
		// and end quiz
		// 3. if they say yes
		// ask them what is their favorite hobby
		if (like.equalsIgnoreCase("yes")) {
			String hobby = JOptionPane.showInputDialog(null, "Okay. " + name + ", What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, "Your hobby, " + hobby + ", is much better with bananas!!!");
		}
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than “yes�? or “no�?
		// show a pop up that says “You are bananas!�?

	}
}
