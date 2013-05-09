package DatapathComponents;

import java.util.HashMap;
import java.util.Iterator;

public class RegisterFile {
	private HashMap<String, Register> file;

	public RegisterFile() {
		file = new HashMap<String, Register>();
		file.put("zero", new Register("zero", 0));
		file.put("v0", new Register("v0", 0));
		file.put("v1", new Register("v1", 0));
		for (int i = 0; i <= 9; i++) {
			file.put("t" + i, new Register("t" + i, 0));
		}
		for (int i = 0; i <= 7; i++) {
			file.put("s" + i, new Register("s" + i, 0));
		}
		for (int i = 0; i <= 3; i++) {
			file.put("a" + i, new Register("a" + i, 0));
		}
		file.put("gp", new Register("gp", 0));
		file.put("sp", new Register("sp", 0));
		file.put("fp", new Register("fp", 0));
		file.put("ra", new Register("ra", 0));
	}

	public void reset() {
		Iterator<Register> itr = file.values().iterator();
		while (itr.hasNext()) {
			itr.next().setValue(0);
		}
	}

	public Register getRegister(String name) {
		return file.get(name);
	}

	public int getValue(String name) {
		return file.get(name).getValue();
	}

	public void setRegister(String name, Register reg) {
		file.put(name, reg);
	}

	public void setRegister(String name, int val) {
		Register reg = file.get(name);
		reg.setValue(val);
		file.put(name, reg);
	}

	public void print() {
		Iterator<Register> values = file.values().iterator();
		Iterator<String> keys = file.keySet().iterator();
		while (values.hasNext()) {
			System.out.print("$"+keys.next()+": "+values.next().getValue()+"    ");
			if(values.hasNext())System.out.print("$"+keys.next()+": "+values.next().getValue()+"    ");
			if(values.hasNext())System.out.print("$"+keys.next()+": "+values.next().getValue()+"    ");
			if(values.hasNext())System.out.print("$"+keys.next()+": "+values.next().getValue()+"    ");
			if(values.hasNext())System.out.print("$"+keys.next()+": "+values.next().getValue()+"    ");
			System.out.println();
		}
	}
}
