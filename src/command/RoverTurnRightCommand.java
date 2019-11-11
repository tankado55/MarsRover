package command;

import rover.Rover;

public class RoverTurnRightCommand implements Command {
	
	Rover rover;

	public RoverTurnRightCommand(Rover rover) {
		this.rover = rover;
	}

	@Override
	public void execute() {
		rover.turnRight();
	}

}
