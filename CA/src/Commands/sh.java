package Commands;

import Utilities.BinaryUtilities;
import DatapathComponents.CPU;
import DatapathComponents.ControlFile;
import DatapathComponents.Register;

public class sh extends RFormatCommand {
	int address;

	public sh(Register des, int address) {
		destination = des;
		this.address = address;
	}

	public void execute() {
		int value = destination.getValue();
		String valuebin = BinaryUtilities.convertDecimalToBinary(value);
		String halfvalue = valuebin.substring(16);
		int memValue = CPU.getCPU().getMemFile().getValue(address);
		String memBin = BinaryUtilities.convertDecimalToBinary(memValue);
		String firstHalf = memBin.substring(0, 15);
		String lastvalue = firstHalf + halfvalue;
		int result = BinaryUtilities.convertBinaryToDecimal(lastvalue);
		CPU.getCPU().getMemFile().setValue(address, result);
		ControlFile.setControl("MemWrite", 1);
	}
}
