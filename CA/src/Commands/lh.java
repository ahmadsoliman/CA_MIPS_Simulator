package Commands;

import Utilities.BinaryUtilities;
import DatapathComponents.CPU;
import DatapathComponents.ControlFile;
import DatapathComponents.Register;
import DatapathComponents.signExtender;

public class lh extends RFormatCommand {
	int address;

	public lh(Register des, int address) {
		destination = des;
		this.address = address;
	}

	public void execute() {
		int value = CPU.getCPU().getMemFile().getValue(address);
		String valuebin = BinaryUtilities.convertDecimalToBinary(value);
		String halfvalue = valuebin.substring(16);
		String extended = signExtender.extend16(halfvalue); 
		int lastvalue = BinaryUtilities.convertBinaryToDecimal(extended);
		destination.setValue(lastvalue);
		ControlFile.setControl("RegDest", 1);
		ControlFile.setControl("MemRead", 1);
		ControlFile.setControl("MemToReg", 1);
		ControlFile.setControl("RegWrite", 1);
	}
}
