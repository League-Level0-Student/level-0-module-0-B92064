
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	public static void main(String[] args) throws Exception {

		// 1. Make a new Robot
		Robot R = new Robot();

		// 3. Put the robot's pen down
		R.penDown();

		// 6. Make the robot move as fast as possible
		R.setSpeed(90000);

		// 5. Do everything below here 4 times
		for (int i = 0; i < 1000; i++) {
			R.move(10);
			R.turn(4);
		}

		// 2. Move your robot 200 pixels

		// 4. Turn the robot 90 degrees to the right (90 degrees)

	}
}
