package Commands;

import DatapathComponents.CPU;
import DatapathComponents.Register;

public class lw extends RFormatCommand {
	int address;

	public lw(Register des, int address) {
		destination = des;
		this.address = address;
	}

	public void execute() {
		destination.setValue(CPU.getCPU().getMemFile().getValue(address));

	}
}
