package Commands;

import Utilities.BinaryUtilities;
import DatapathComponents.CPU;
import DatapathComponents.Register;

public class sb extends RFormatCommand {
	int address;

	public sb(Register des, int address) {
		destination = des;
		this.address = address;
	}

	public void execute() {
		int value = destination.getValue();
		String valuebin = BinaryUtilities.convertDecimalToBinary(value);
		String halfvalue = valuebin.substring(25);
		int memValue = CPU.getCPU().getMemFile().getValue(address);
		String memBin = BinaryUtilities.convertDecimalToBinary(memValue);
		String firstHalf = memBin.substring(0, 24);
		String lastvalue = firstHalf + halfvalue;
		int result = BinaryUtilities.convertBinaryToDecimal(lastvalue);
		CPU.getCPU().getMemFile().setValue(address, result);

	}
}
