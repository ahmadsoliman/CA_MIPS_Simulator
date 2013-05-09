package DatapathComponents;

import java.util.HashMap;

public class DataFile {
	
	private HashMap<String, DataElem> data;

	public DataFile() {
		data = new HashMap<String, DataElem>();
	}
	
	public Object getValue(String name) {
		return data.get(name);
	}

	public void setValue(String name, DataElem val) {
		data.put(name, val);
	}
	

}
