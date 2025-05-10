package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	
	public void run() {
		rob.penDown();
		rob.setX(5);
		rob.setSpeed(100);
		
		rob.turn(90);
		Random ran = new Random();
		for(int i=0; i<9; i++) {
			int randomNumber = ran.nextInt(3);
			if(randomNumber==0) {
				drawHouse("small", "red");
			}else if(randomNumber==1) {
				drawHouse("medium","green");
			}else {
				drawHouse("large","blue");
			}
		}
		
	
		
		/*
		 * 1. Have a robot start on the left side of the window near the bottom.

2. Draw a flat-topped house of height 100 with grass after it (see picture).

3. Extract the piece of code that draws the house into a method. Draw 10 houses.

4. Change the method to take (int height) as a parameter. Draw 9 houses of different heights

5. Make the method take a String instead of an int.

        “small”                 60

        “medium”             120

        “large”                 250

6. Make the method take a color as well as a height. The houses are drawn in that color.

[optional] Set the scene to night by setting the background to black

7. Give the houses peaked roofs

8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”.

9. Make large houses have flat roofs

		 */
		
		
	}
	
	public void drawHouse(String height, String color) {
		int h=0;

		rob.move(50);
		rob.turn(-90);
		if(height.equals("small")) {
			h=60;
			rob.move(h);
			rob.turn(90);
			rob.setPenColor(0,100,0);
			rob.move(50);
			rob.setPenColor(100,0,0);
			rob.turn(90);
			rob.move(h);
		}else if(height.equals("medium")) {
			h=100;
			rob.move(h);
			rob.turn(90);
			rob.setPenColor(0,100,0);
			rob.move(50);
			rob.setPenColor(0,100,100);
			rob.turn(90);
			rob.move(h);
		}else {
			h=200;
			rob.move(h);
			rob.turn(90);
			rob.setPenColor(0,100,0);
			rob.move(50);
			rob.setPenColor(0,0,100);
			rob.turn(90);
			rob.move(h);
		}
	
		
	
		rob.turn(-90);
	}
}
