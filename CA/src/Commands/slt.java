package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public abstract class slt extends RFormatCommand  {
	public slt(Register rd, Register rs, Register rt) {
		rd.setValue(ALU.setLessThan(rs, rt));
	}
}
