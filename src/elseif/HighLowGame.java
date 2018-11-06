//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		
		// 2. Print out the random variable above
		System.out.println(random); 
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String name=JOptionPane.showInputDialog("Dear user, what is your name?");
String guess= JOptionPane.showInputDialog("Hey " +name+ ", please enter a number guess into the box below.");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
int e= Integer.parseInt(guess);
			// 5. if the guess is correct
				// 6. Win
if (e==random) {
	JOptionPane.showMessageDialog(null, "Congrats, " +name+ "! You guessed correctly.");
	System.exit(0);
}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
if (e>random) {
	JOptionPane.showMessageDialog(null, "Sorry, " +name+ ". Your guess was too high. You lose.");
}
			// 9. if the guess is low
				// 10. Tell them it's too low
if (e<random) {
	JOptionPane.showMessageDialog(null, "Sorry, " +name+ ". Your guess was too low. You lose.");		
	// 13. Tell them they lose
		
	}

}}


