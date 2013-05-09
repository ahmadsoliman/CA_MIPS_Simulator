package DatapathComponents;

public class Control {
	String name;
	int value;
	
	public Control(int value) {
		this.value = value;
	}
	
	public Control(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
