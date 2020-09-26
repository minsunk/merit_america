/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	// 1.Move to the Newspaper
	// 2.Pick it up
	// 3.Return to its starting point
	public void run(){
		moveToTheNewspaper();
		PickItUp();
		ReturnHome();
	}
	private void moveToTheNewspaper(){
		while(frontIsClear()){
			move();
		}
		turnRight();
		move();
		turnLeft();
		move();
	}
	//	pick up the Newspaper
	private void PickItUp(){
		pickBeeper();
		turnAround();
	}
	//return home
	private void ReturnHome(){
		while(frontIsClear()){
			move();
		}
		turnRight();
		move();
		turnRight();
	}
}