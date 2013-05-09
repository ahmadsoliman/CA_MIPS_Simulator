package Commands;

import DatapathComponents.ALU;
import DatapathComponents.ControlFile;
import DatapathComponents.Register;

public class add extends RFormatCommand {
	int sum;

	public add(Register des, Register s1, Register s2) {
		destination=des;
		source1=s1;
		source2=s2;
	}

	public void execute() {
		sum = ALU.add(source1.getValue(), source2.getValue());
		destination.setValue(sum);
		// controls:
		// RegDest, ALUsrc, RegWrite, ALUop
		ControlFile.setControl("RegDest", 1);
		ControlFile.setControl("ALUsrc", 0);
		ControlFile.setControl("RegWrite", 1);
		//ControlFile.setControl("ALUop", 0010);
	}

}
