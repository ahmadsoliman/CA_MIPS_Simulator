package Commands;

import Utilities.BinaryUtilities;
import DatapathComponents.CPU;
import DatapathComponents.ControlFile;
import DatapathComponents.Register;

public class lbu extends RFormatCommand {
	int address;

	public lbu(Register des, int address) {
		destination = des;
		this.address = address;
	}

	public void execute() {
		int value = CPU.getCPU().getMemFile().getValue(address);
		String valuebin = BinaryUtilities.convertDecimalToBinary(value);
		String halfvalue = valuebin.substring(25); 
		int lastvalue = BinaryUtilities.convertBinaryToDecimal(halfvalue);
		destination.setValue(lastvalue);
		ControlFile.setControl("RegDest", 1);
		ControlFile.setControl("MemRead", 1);
		ControlFile.setControl("MemToReg", 1);
		ControlFile.setControl("RegWrite", 1);
	}
}
