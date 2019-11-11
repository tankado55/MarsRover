package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import command.Command;
import command.CommandController;
import command.RoverGoForwardCommand;
import command.RoverTurnLeftCommand;
import command.RoverTurnRightCommand;
import direction.Direction;
import direction.EastDirection;
import main.Altopiano;
import rover.Rover;

public class MarsRoverTest {

	
	@Test
	public void test() throws Exception {
		
		Altopiano altopiano = new Altopiano(5,5);
		Direction direction = new EastDirection();
		Rover rover = new Rover(3, 3, direction , altopiano);
		char[] instructions = {'M','M','R','M','M','R','M','R','R','M'};
		
		//rover posizione iniziale
        assertEquals(3, rover.getX());
        assertEquals(3, rover.getY());
        assertEquals('E', rover.getDirectionChar());
        
		
		Command go = new RoverGoForwardCommand(rover);
		Command left = new RoverTurnLeftCommand(rover);
		Command right = new RoverTurnRightCommand(rover);
		Command commands[] = {go, left, right};
		
		CommandController controller = new CommandController();
		controller.setCommands(commands);
		controller.execInstructions(instructions);
		
		//altopiano
		assertEquals(5, altopiano.getX());
        assertEquals(5, altopiano.getY());
        
        //rover posizione finale
        assertEquals(5, rover.getX());
        assertEquals(1, rover.getY());
        assertEquals('E', rover.getDirectionChar());
        
	}
}
