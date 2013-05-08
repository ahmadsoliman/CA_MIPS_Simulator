package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Label;
import DatapathComponents.Register;

public abstract class bne extends IFormatCommand {
	int sub;

	public bne(Register rs, Register rt, Label L1) {
		sub = ALU.subtract(rs.getValue(), rt.getValue());
		if (sub != 0) {
			// branch to L1
			// PC to L1.index
			// controls:
			// ALUsrc, branch, ALUop
		}
	}
}