import stanford.karel.*;

public class VotingBox extends SuperKarel {
	//1. Move if front is clear
	//2. Cleanup the chad if there is no beeper present
	
// Move if front is clear
	public void run() {
		while (frontIsClear()){
			move();
			if (noBeepersPresent()){
				cleanUpChad();
			}
			move();
		}
	}
//Cleanup the chad from a ballot, which means present beepers to the left and right side from Karel
	private void cleanUpChad(){
		turnLeft();
		checkCornerChad();
		checkCornerChad();
		turnRight();
	}
	
	private void checkCornerChad(){
		move();
		while (beepersPresent()){
			pickBeeper();
		}
		turnAround();
		move();
	}
}
		
		
