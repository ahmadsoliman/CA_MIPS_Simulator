package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public abstract class add extends RFormatCommand {
	int sum;

	public add(Register t0, Register s1, Register s2) {
		sum = ALU.add(s1, s2);
		t0.setValue(sum);
	}
}