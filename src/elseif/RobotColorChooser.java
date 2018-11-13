//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		String color="";
	
			Robot RottenBanana= new Robot();
			for (int e=0; e<4; e++){
		//3. Ask the user what color they would like the robot to draw
		
		if (e==0) {
			String name=JOptionPane.showInputDialog("Dear player, what is your name?");
			color= JOptionPane.showInputDialog("Hey " +name+ ", what color would you like my robor, RottenBanana, to draw? Just saying, if you don't enter anything, or if my robot doesn't know that color, my robot will draw a random color.");
		}
		else {
		 color= JOptionPane.showInputDialog(null, "What color now?");
		}
		//5. Use an if/else statement to set the pen color that the user requested
if (color.equalsIgnoreCase("red")) {
	RottenBanana.setPenColor(Color.RED);
}
if (color.equalsIgnoreCase("blue")) {
	RottenBanana.setPenColor(Color.BLUE);
}
if (color.equalsIgnoreCase("pink")) {
	RottenBanana.setPenColor(Color.PINK);
}
if (color.equalsIgnoreCase("green")) {
	RottenBanana.setPenColor(Color.GREEN);
}
if (color.equalsIgnoreCase("yellow")) {
	RottenBanana.setPenColor(Color.YELLOW);
}
if (color.equalsIgnoreCase("orange")) {
	RottenBanana.setPenColor(Color.ORANGE);
}

else{
	JOptionPane.showMessageDialog(null, "Sorry. I don't know that color.");
	JOptionPane.showMessageDialog(null, "RottenBanana is going to draw a random color.");
	RottenBanana.setRandomPenColor();
}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
RottenBanana.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)


RottenBanana.penDown();
RottenBanana.setRandomPenColor();
RottenBanana.setSpeed(20);
for(int i=0; i<1; i++) {
	RottenBanana.move(200);
	RottenBanana.turn(90);
}

	}
}}
