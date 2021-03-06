package Commands;

import DatapathComponents.CPU;
import DatapathComponents.Register;
import DatapathComponents.RegisterFile;

public abstract class RFormatCommand extends IRFormatCommand {
	Register source2;
	int shamt;

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

	public static Register[] prepareMemoryCommand(String dt, String st) {
		if (!(st.matches("\\$..") || dt.matches("\\$.."))) {
			return null;
		}
		Register[] regs = new Register[3];
		RegisterFile regFile = CPU.getCPU().getRegFile();
		regs[0] = regFile.getRegister(dt.substring(1));
		String[] comps = st.split("(");
		int offset = Integer.parseInt(comps[0]);
		regs[1] = regFile.getRegister(comps[1].substring(1, comps[1].length()-1));
		regs[2] = new Register(offset);
		return regs;
	}
}