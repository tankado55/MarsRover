package command;
import rover.Rover;

public class RoverGoForwardCommand implements Command {
	
	Rover rover;
	
	public RoverGoForwardCommand(Rover rover) {
		this.rover = rover;
	}

	@Override
	public void execute() throws Exception {
		rover.goForward();
		
	}

}
