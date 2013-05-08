package Commands;

import DatapathComponents.CPU;
import DatapathComponents.Label;

public class j extends JFormatCommand {
	public j(Label L1) {
		destination = L1;
	}

	public void execute() {
		// branch L1
		CPU.getCPU().getPC().setValue(destination.getIndex());

	}
}