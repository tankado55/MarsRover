package rover;
import direction.Direction;
import main.Altopiano;

public class Rover {

	private int x;
	private int y;
	private Direction direction;
	private Altopiano altopiano;
	
	public Rover(int x, int y, Direction direction, Altopiano altopiano) {
		this.setX(x);
		this.setY(y);
		this.direction = direction;
		this.altopiano = altopiano;
	}
	
	public void goForward() throws Exception {
		direction.goForward(this);
		if (x<0 | y<0 | x > altopiano.getX() | y > altopiano.getY())
			throw new RoverOutOfAltopianoException();
	}
	
	public void turnLeft() {
		direction = direction.turnLeft();
	}
	
	public void turnRight() {
		direction = direction.turnRight();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public char getDirectionChar () {
		return direction.getChar();
	}
	
	
}
