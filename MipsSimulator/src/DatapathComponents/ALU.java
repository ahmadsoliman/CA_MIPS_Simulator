package DatapathComponents;

public class ALU {

	public ALU() {
	}
	
	public int add(Register r1, Register r2){
		return r1.value + r2.value;
	}
	
	public int subtract(Register r1, Register r2){
		return r1.value - r2.value;
	}
	
}
