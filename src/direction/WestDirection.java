package direction;

import rover.Rover;

public class WestDirection implements Direction {

	char c = 'W';
	
	@Override
	public Direction turnRight() {
		return new NorthDirection();
	}

	@Override
	public Direction turnLeft() {
		return new SouthDirection();
	}

	@Override
	public void goForward(Rover rover) {
		rover.setX(rover.getX() - 1);
	}

	@Override
	public char getChar() {
		return c;
	}
}
