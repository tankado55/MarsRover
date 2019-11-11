package main;
import java.util.ArrayList;

import command.Command;
import command.CommandController;
import command.RoverGoForwardCommand;
import command.RoverTurnLeftCommand;
import command.RoverTurnRightCommand;
import rover.Rover;

public class MarsRoverMain {

	public static void main(String[] args) throws Exception {
		
		ArrayList<String> inputRowList = Utils.parseInputText(MarsRoverMain.class.getResourceAsStream("/input.txt"));
		

		Altopiano altopiano = Utils.parseRowAltopiano(inputRowList.get(0));
		
		for (int i = 1; i < inputRowList.size(); i+=2) {
			Rover rover = Utils.parseRowRover(inputRowList.get(i), altopiano);
			char[] instructions = Utils.parseRowInstruction(inputRowList.get(i+1));
			
			Command go = new RoverGoForwardCommand(rover);
			Command left = new RoverTurnLeftCommand(rover);
			Command right = new RoverTurnRightCommand(rover);
			Command commands[] = {go, left, right};
			
			CommandController controller = new CommandController();
			controller.setCommands(commands);
			controller.execInstructions(instructions);
			System.out.println(rover.getX()+" "+rover.getY() + " " + rover.getDirectionChar());
		}
	}

}
