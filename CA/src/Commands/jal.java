package Commands;

import DatapathComponents.CPU;
import DatapathComponents.ControlFile;
import DatapathComponents.Label;

public class jal extends JFormatCommand {
	public jal(Label L1) {
		destination = L1;
	}

	public void execute() {
		// address of following instruction put in $ra
		// jumps to target address
		CPU.getCPU().getRegFile()
				.setRegister("ra", CPU.getCPU().getPC().getValue() + 1);
		CPU.getCPU().getPC().setValue(destination.getIndex());
		ControlFile.setControl("Jump", 1);
	}
}
