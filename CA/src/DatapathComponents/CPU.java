package DatapathComponents;

import java.util.ArrayList;
import Commands.Command;

public class CPU {
	RegisterFile regFile;
	Memory memFile;
	ArrayList<Command> commands;
	
	public CPU() {
		regFile = new RegisterFile();
		memFile = new Memory();
		commands = new ArrayList<Command>();
		
		
		// TODO Auto-generated constructor stub
	}
	
}
