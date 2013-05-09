package DatapathComponents;

public class signExtender {

	public static String extend8(String value) {
		String zeros8 = "000000000000000000000000";
		String ones8 = "111111111111111111111111";
		String result = "";
		char first = value.charAt(0);
		if (first == 0) {
			result = zeros8 + value;
		} else {
			result = ones8 + value;
		}
		return result;
	}
	
	public static String extend16(String value) {
		String zeros16 = "0000000000000000";
		String ones16 = "1111111111111111";
		String result = "";
		char first = value.charAt(0);
		if (first == 0) {
			result = zeros16 + value;
		} else {
			result = ones16 + value;
		}
		return result;
	}
}
