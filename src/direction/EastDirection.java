package direction;

import rover.Rover;

public class EastDirection implements Direction {
	
	char c = 'E';

	@Override
	public Direction turnRight() {
		return new SouthDirection();
	}

	@Override
	public Direction turnLeft() {
		return new NorthDirection();
	}

	@Override
	public void goForward(Rover rover) {
		rover.setX(rover.getX() + 1);
	}
	
	@Override
	public char getChar() {
		return c;
	}

}
