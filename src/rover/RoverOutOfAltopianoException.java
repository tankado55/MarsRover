package rover;

public class RoverOutOfAltopianoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RoverOutOfAltopianoException() {
		super("The Rover has fallen! Mission failed");
	}
}
