package Commands;

import DatapathComponents.ALU;
import DatapathComponents.CPU;
import DatapathComponents.Label;
import DatapathComponents.Register;

public class bne extends IFormatCommand {
	int sub;

	public bne(Register rs, Register rt, Label L1) {
		destination=rs;
		source1=rt;
		source2=L1.getIndex();
	}

	public void execute() {
		sub = ALU.subtract(destination.getValue(), source1.getValue());
		if (sub != 0) {
			// branch to L1
			// PC to L1.index
			CPU.getCPU().getPC().setValue(source2);
			// controls:
			// ALUsrc, branch, ALUop
		}
	}
}