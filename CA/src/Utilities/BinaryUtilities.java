package Utilities;

import java.math.BigInteger;

public class BinaryUtilities {
	
	public static int convertBinaryToDecimal(String binary){
		return new BigInteger(binary, 2).intValue();
	}
	
	public static String convertDecimalToBinary(int decimal){
		return Integer.toBinaryString(decimal);
	}

}
