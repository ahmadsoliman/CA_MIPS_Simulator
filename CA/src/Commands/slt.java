package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public class slt {
	public slt(Register rd, Register rs, Register rt) {
		rd.setValue(ALU.setLessThan(rs, rt));
	}
}
