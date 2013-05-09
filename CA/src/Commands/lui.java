package Commands;

import Utilities.BinaryUtilities;
import DatapathComponents.ControlFile;
import DatapathComponents.Register;

public class lui extends IFormatCommand {

	public lui(Register s, int immediate) {
		source1 = s;
		source2 = immediate;
	}

	public void execute() {
		int regVal = source1.getValue();
		String regBin = BinaryUtilities.convertDecimalToBinary(regVal);
		String regLast = regBin.substring(16);
		String firstBin = BinaryUtilities.convertDecimalToBinary(source2);
		String all = firstBin + regLast;
		int result = BinaryUtilities.convertBinaryToDecimal(all);
		source1.setValue(result);
		ControlFile.setControl("RegDest", 1);
		ControlFile.setControl("RegWrite", 1);
	}

}
