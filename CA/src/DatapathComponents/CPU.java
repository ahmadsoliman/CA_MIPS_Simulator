package DatapathComponents;

import java.util.ArrayList;
import java.util.Stack;

import Commands.Command;

public class CPU {
	private static CPU CPUInstance;

	public static CPU getCPU() {
		if (CPUInstance == null) {
			CPUInstance = new CPU();
		}
		return CPUInstance;
	}

	Register PC;
	RegisterFile regFile;
	Memory memFile;
	ArrayList<Command> commands;
	Stack branchingStack;

	private CPU() {
		PC = new Register(0);
		regFile = new RegisterFile();
		memFile = new Memory();
		commands = new ArrayList<Command>();
		branchingStack = new Stack();

		// TODO Auto-generated constructor stub
	}

	public Stack getBranchingStack() {
		return branchingStack;
	}

	public void setBranchingStack(Stack branchingStack) {
		this.branchingStack = branchingStack;
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

}
