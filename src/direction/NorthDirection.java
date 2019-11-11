package direction;

import rover.Rover;

public class NorthDirection implements Direction {

	char c = 'N';
	
	@Override
	public Direction turnRight() {
		return new EastDirection();
	}

	@Override
	public Direction turnLeft() {
		return new WestDirection();
	}

	@Override
	public void goForward(Rover rover) {
		rover.setY(rover.getY() + 1); 
	}

	@Override
	public char getChar() {
		return c;
	}
}
