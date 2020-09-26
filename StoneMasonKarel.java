/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import com.sun.org.apache.xpath.internal.operations.Bool;

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
    
	//1.Fix StoneMason and move four times while front is clear and turn left
	//2.FixStoneMason : Move while front is clear and put beeper, turn around, move back while front is clear,and turn left
	//3.quit if front is blocked
	
//	1.Fix StoneMason and move four times while front is clear and turn left
	public void run(){
		fixStoneMason();
		while (frontIsClear()) {
			for (int i=0; i<4; i++){
				move();
			}
			fixStoneMason();
		}
	}
			
//	2.Fix StoneMason: Move while front is clear and put beeper, turn around, move back while front is clear,and turn left
	private void fixStoneMason(){
		turnLeft();
		if (noBeepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			move();
			if (noBeepersPresent()){
				putBeeper();
			}
		}
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}
}	
   
			
