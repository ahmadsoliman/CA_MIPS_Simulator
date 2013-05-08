package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Label;
import DatapathComponents.Register;

public abstract class beq extends IFormatCommand {
	int sub;

	public beq(Register rs, Register rt, Label L1) {
		sub = ALU.subtract(rs.getValue(), rt.getValue());
		if (sub == 0) {
			// branch to L1
		}
	}
}