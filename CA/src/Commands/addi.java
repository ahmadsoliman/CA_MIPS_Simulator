package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public abstract class addi extends RFormatCommand {
	int sum;

	public addi(Register t0, Register s1, int s2) {
		sum = ALU.add(s1.getValue(), s2);
		t0.setValue(sum);
		// controls:
		// RegDst, ALUsrc, RegWrite, ALUop
	}
}
