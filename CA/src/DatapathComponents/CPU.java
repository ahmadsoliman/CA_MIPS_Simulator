package DatapathComponents;

import java.util.ArrayList;
import Commands.Command;

public class CPU {
	private static CPU CPUInstance;

	public static CPU getCPU() {
		if (CPUInstance == null) {
			CPUInstance = new CPU();
		}
		return CPUInstance;
	}

	private Register PC;
	private RegisterFile regFile;
	private Memory memFile;
	private ArrayList<Command> commands;
	private LabelFile labelFile;

	private CPU() {
		PC = new Register(0);
		regFile = new RegisterFile();
		memFile = new Memory();
		commands = new ArrayList<Command>();
		setLabelFile(new LabelFile());

		// TODO Auto-generated constructor stub
	}

	public Register getPC() {
		return PC;
	}

	public void setPC(Register pC) {
		PC = pC;
	}

	public RegisterFile getRegFile() {
		return regFile;
	}

	public void setRegFile(RegisterFile regFile) {
		this.regFile = regFile;
	}

	public Memory getMemFile() {
		return memFile;
	}

	public void setMemFile(Memory memFile) {
		this.memFile = memFile;
	}

	public ArrayList<Command> getCommands() {
		return commands;
	}

	public void setCommands(ArrayList<Command> commands) {
		this.commands = commands;
	}

	public LabelFile getLabelFile() {
		return labelFile;
	}

	public void setLabelFile(LabelFile labelFile) {
		this.labelFile = labelFile;
	}
	
}
