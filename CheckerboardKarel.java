/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */
//Create Checker board depending Karel's orientation
//If facing east, put beeper when right is clear,and if front blocked, turn left twice 
//If facing west, put beeper when left is clear, and if front blocked, turn right twice
//Check the ceing if it is blocked. 

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		// as long as not facing north, keep repeating these cycles
		while (notFacingNorth()) {
			// if Karel is facing East
			if (facingEast()) {
				 // if front is clear
				if (frontIsClear()) {
					if (beepersPresent()) {	// is there a beeper?
						// move
						move();
					} else {
						// move
						move();
						// place beeper
						putBeeper();
					}
				} else { // front is blocked
					// turn left
					turnLeft();
					if (frontIsClear()) {	// if front is not blocked?
						// move and then turn left again
						move();
						turnLeft();
					}
				}
			// if Kael is facing West
			} else if (facingWest()) {
				// if front is clear
				if (frontIsClear()) {
					if (beepersPresent()) {	// is there a beeper?
						// move
						move();
					} else {
						// move
						move();
						// place beeper
						putBeeper();
					}
				// front is blocked
				} else {
					// turn right
					turnRight();
					if (frontIsClear()) {	// if front is not blocked?
						// move and then turn left again
						move();
						turnRight();
					}
				}
			}
				
		}
	}
}
			
