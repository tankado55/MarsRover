package direction;

import rover.Rover;

public class SouthDirection implements Direction {

	char c = 'S';
	
	@Override
	public Direction turnRight() {
		return new WestDirection();
	}

	@Override
	public Direction turnLeft() {
		return new EastDirection();
	}

	@Override
	public void goForward(Rover rover) {
		rover.setY(rover.getY() - 1);

	}

	@Override
	public char getChar() {
		return c;
	}
}
