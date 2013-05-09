package DatapathComponents;

import java.util.HashMap;

public class LabelFile {
	private HashMap<String, Label> file;

	public LabelFile() {
		file = new HashMap<String, Label>();
	}

	public void reset() {
		file = new HashMap<String, Label>();
	}
	
	public int getValue(String name) {
		return file.get(name).getIndex();
	}
	
	public Label getLabel(String name) {
		return file.get(name);
	}
	
	public Label setLabel(String name, Label l) {
		return file.put(name, l);
	}
	
}
