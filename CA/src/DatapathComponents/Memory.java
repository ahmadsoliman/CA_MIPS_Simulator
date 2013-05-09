package DatapathComponents;

import java.util.HashMap;
import java.util.Iterator;

public class Memory {
	HashMap<Integer, Integer> mem;

	public Memory() {
		mem = new HashMap<Integer, Integer>();
		// TODO Auto-generated constructor stub
	}

	public void setValue(int index, int value) {
		mem.put(index, value);
	}
	
	public int getValue(int index) {
		return mem.get(index);
	}

	public void print() {
		System.out.println("Memory:");
		Iterator<Integer> values = mem.values().iterator();
		Iterator<Integer> keys = mem.keySet().iterator();
		while (values.hasNext()) {
			System.out.print("$"+keys.next()+": "+values.next()+"    ");
			if(values.hasNext())System.out.print("$"+keys.next()+": "+values.next()+"    ");
			if(values.hasNext())System.out.print("$"+keys.next()+": "+values.next()+"    ");
			if(values.hasNext())System.out.print("$"+keys.next()+": "+values.next()+"    ");
			if(values.hasNext())System.out.print("$"+keys.next()+": "+values.next()+"    ");
			System.out.println();
		}
	}
}
