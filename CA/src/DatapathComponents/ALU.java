package DatapathComponents;

public class ALU {

	public ALU() {
	}
	
	public static int add(Register r1, Register r2){
		return r1.value + r2.value;
	}
	
	public static int subtract(Register r1, Register r2){
		return r1.value - r2.value;
	}
	
	public static int setLessThan(Register r1, Register r2) {
		if (r1.value < r2.value) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
