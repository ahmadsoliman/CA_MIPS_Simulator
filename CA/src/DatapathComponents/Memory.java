package DatapathComponents;

import java.util.ArrayList;

public class Memory {
	ArrayList<Integer> mem;

	public Memory() {
		// TODO Auto-generated constructor stub
	}

	public void setValue(int index, int value) {
		mem.set(index, value);
	}
	
	public void getValue(int index) {
		mem.get(index);
	}
}
