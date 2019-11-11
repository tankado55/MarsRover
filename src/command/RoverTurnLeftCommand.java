package command;

import rover.Rover;

public class RoverTurnLeftCommand implements Command{

	Rover rover;
	
	public RoverTurnLeftCommand(Rover rover) {
		this.rover= rover;
	}
	@Override
	public void execute() {
		rover.turnLeft();
		
	}
	
}
