/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	// You fill in this part
//	1.Put beepers on the entire row.
//	2.Pick up beeper from one end to the other and repeat until there is no beeper.	
//	3.turn around, move one step, and put beeper.
	
//	1.Put beepers on the entire row.
	public void run(){ 
		while (frontIsClear()){
			move();
			putBeeper();
		}
		pickBeeper();
		turnAround();
		move();
//	2.Pick up beeper from one end to the other and repeat until there is no beeper.
		while (beepersPresent()) {
			while (beepersPresent()){
				move();
			}
			turnAround();
			move();
			pickBeeper();
			move();
		}
//	3.turn around, move one step, and put beeper.
		turnAround();
		move();
		putBeeper();
	}
}
		
	

