package Commands;

import DatapathComponents.ALU;
import DatapathComponents.Register;

public class sub extends RFormatCommand{
	int sub;

	public sub(Register t0, Register s1, Register s2) {
		sub = ALU.subtract(s1.getValue(), s2.getValue());
		t0.setValue(sub);
		// controls:
		// RegDst, ALUsrc, RegWrite, ALUop
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	
}
