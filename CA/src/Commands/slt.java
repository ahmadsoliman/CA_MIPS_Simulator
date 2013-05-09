package Commands;

import DatapathComponents.ALU;
import DatapathComponents.ControlFile;
import DatapathComponents.Register;

public class slt extends RFormatCommand {
	public slt(Register rd, Register rs, Register rt) {
		destination = rd;
		source1 = rs;
		source2 = rt;
	}

	public void execute() {
		destination.setValue(ALU.setLessThan(source1.getValue(),
				source2.getValue()));
		// controls:
		// RegDst, ALUsrc, RegWrite, ALUop
		ControlFile.setControl("RegDest", 1);
		ControlFile.setControl("ALUsrc", 0);
		ControlFile.setControl("RegWrite", 1);
		//ControlFile.setControl("ALUop", 0111);
	}
}
