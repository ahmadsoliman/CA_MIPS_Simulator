package DatapathComponents;

public class ALU {

	public ALU() {
	}
	
	public static int add(int r1, int r2){
		return r1 + r2;
	}
	
	public static int subtract(int r1, int r2){
		return r1 - r2;
	}
	
	public static int setLessThan(int r1, int r2) {
		if (r1 < r2) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int and(int r1, int r2) {
		return  r1 & r2;
	}
	
	public static int or(int r1, int r2) {
		return  r1 | r2;
	}
	
	public static int nor(int r1, int r2) {
		return  ~(r1 | r2);
	}
	
}
