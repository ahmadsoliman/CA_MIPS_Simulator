package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public class slt extends RFormatCommand  {
	public slt(Register rd, Register rs, Register rt) {
		rd.setValue(ALU.setLessThan(rs.getValue(), rt.getValue()));
		// controls:
		// RegDst, ALUsrc, RegWrite, ALUop
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
}
