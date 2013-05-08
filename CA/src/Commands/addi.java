package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public abstract class addi extends IFormatCommand {
	int sum;

	public addi(Register des, Register s1, int s2) {
		destination=des;
		source1=s1;
		source2=s2;
	}

	public void execute() {
		sum = ALU.add(source1.getValue(), source2);
		destination.setValue(sum);
		// controls:
		// RegDst, ALUsrc, RegWrite, ALUop
	}
}
