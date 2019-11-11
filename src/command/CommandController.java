package command;

public class CommandController {

	Command[] commands;
	
	public void setCommands(Command[] commands) {
		this.commands = commands;
	}
	
	public void execInstructions (char[] instructions) throws Exception {
		for (char c : instructions) {
			switch (c) {
			case 'M':
				commands[0].execute();
				break;
			case 'L':
				commands[1].execute();
				break;
			case 'R':
				commands[2].execute();
				break;
			}
			
		}
	}
}
