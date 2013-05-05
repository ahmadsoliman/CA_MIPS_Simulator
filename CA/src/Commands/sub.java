package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public abstract class sub extends RFormatCommand{
	int sub;

	public sub(Register t0, Register s1, Register s2) {
		sub = ALU.subtract(s1, s2);
		t0.setValue(sub);
	}
}
