package direction;

import rover.Rover;

public interface Direction {

	public abstract Direction turnRight();

    public abstract Direction turnLeft();

    public abstract void goForward(Rover rover);
    
    public abstract char getChar();
}
