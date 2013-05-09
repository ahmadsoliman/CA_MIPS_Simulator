package Commands;

import DatapathComponents.ALU;
import DatapathComponents.ControlFile;
import DatapathComponents.Register;

public class sub extends RFormatCommand{

	int sub;

	public sub(Register t0, Register s1, Register s2) {
		destination = t0;
		source1 = s1;
		source2 = s2;
	}

	public void execute() {
		sub = ALU.subtract(source1.getValue(), source2.getValue());
		destination.setValue(sub);
		// controls:
		// RegDst, ALUsrc, RegWrite, ALUop
		ControlFile.setControl("RegDest", 1);
		ControlFile.setControl("ALUsrc", 0);
		ControlFile.setControl("RegWrite", 1);
		//ControlFile.setControl("ALUop", 0110);
	}
	
}
