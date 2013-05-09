package DatapathComponents;

import java.util.ArrayList;

public class Memory {
	ArrayList<Integer> mem;

	public Memory() {
		mem = new ArrayList<Integer>();
		// TODO Auto-generated constructor stub
	}

	public void setValue(int index, int value) {
		mem.set(index, value);
	}
	
	public int getValue(int index) {
		return mem.get(index);
	}
}
