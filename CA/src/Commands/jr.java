package Commands;

import DatapathComponents.CPU;
import DatapathComponents.ControlFile;
import DatapathComponents.Register;

public class jr extends JFormatCommand {
	public jr(Register ra) {
		
	}

	public void execute() {
		// copies $ra to program counter
		CPU.getCPU().setPC(CPU.getCPU().getRegFile().getRegister("ra"));
		ControlFile.setControl("Jump", 1);
	}
}
