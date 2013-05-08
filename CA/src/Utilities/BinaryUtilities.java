package Utilities;

import java.math.BigInteger;

public class BinaryUtilities {
	
	public static int convertBinaryToDecimal(String binary){
		return new BigInteger(binary, 2).intValue();
	}
	
	public static String convertDecimalToBinary(int decimal){
		String val = Integer.toBinaryString(decimal);
		while (val.length()<32){
			val = "0"+val;
		}
		return val;
	}

}
