package Commands;

import DatapathComponents.CPU;
import DatapathComponents.Register;
import DatapathComponents.RegisterFile;

public abstract class RFormatCommand extends IRFormatCommand {
	public static Register[] prepareCommand(String dt, String st, String rt) {
		if (!(st.matches("\\$..") || rt.matches("\\$..") || dt.matches("\\$.."))) {
			return null;
		}
		Register[] regs = new Register[3];
		RegisterFile regFile = CPU.getCPU().getRegFile();
		regs[0] = regFile.getRegister(dt.substring(1));
		regs[1] = regFile.getRegister(st.substring(1));
		regs[2] = regFile.getRegister(rt.substring(1));
		return regs;
	}
}
