package Commands;

import DatapathComponents.CPU;
import DatapathComponents.Register;
import DatapathComponents.RegisterFile;

public abstract class IFormatCommand extends IRFormatCommand{
	public static Register[] prepareCommand(String dt, String st) {
		if (!(st.matches("\\$..") || dt.matches("\\$.."))) {
			return null;
		}
		Register[] regs = new Register[2];
		RegisterFile regFile = CPU.getCPU().getRegFile();
		regs[0] = regFile.getRegister(dt.substring(1));
		regs[1] = regFile.getRegister(st.substring(1));
		return regs;
	}
}
