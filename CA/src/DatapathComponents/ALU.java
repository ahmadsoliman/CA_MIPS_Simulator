package DatapathComponents;

public class ALU {

	public ALU() {
	}
	
	public int add(int r1, int r2){
		return r1 + r2;
	}
	
	public int subtract(int r1, int r2){
		return r1 - r2;
	}
	
	public int setLessThan(int r1, int r2){
		if (r1 < r2){
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int and(int r1, int r2){
		return r1 & r2;
	}
	
	public static int or(int r1, int r2){
		return r1 | r2;
	}
	
	public static int nor(int r1, int r2){
		return ~(r1 | r2);
	}
	
	public static int andi(int r1, int r2){
		return (r1 & r2);
	}
	
	public static int ori(int r1, int r2){
		return (r1 | r2);
	}
	
	}
