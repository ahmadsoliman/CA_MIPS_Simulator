package Commands;

import DatapathComponents.CPU;
import DatapathComponents.ControlFile;
import DatapathComponents.Register;

public class sw extends RFormatCommand {
	int address;

	public sw(Register des, int address) {
		destination = des;
		this.address = address;
	}

	public void execute() {
		CPU.getCPU().getMemFile().setValue(address, destination.getValue());
		ControlFile.setControl("MemWrite", 1);
	}
}
