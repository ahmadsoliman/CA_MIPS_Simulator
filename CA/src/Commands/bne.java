package Commands;

import DatapathComponents.Label;
import DatapathComponents.Register;

public abstract class bne extends IFormatCommand{
	public bne(Register rs, Register rt, Label L1) {
		if (rs.getValue() != rt.getValue()) {
			// branch to L1
		}
	}
}