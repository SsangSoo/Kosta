package chap02;

public class NumberTypeDemo {
	public static void main(String[] args) {
//		정수
		byte	my_byte;  				// 1byte
		short	my_short;				// 2byte
		int 	my_int;					// 4byte
		long	my_long;					// 8byte
		
		
//		실수
		float  	myFloat;				// 4byte
		double 	myDouble;				// 8byte
		
		
//		논리
		boolean	myBoolean; 			// 1byte

//		문자형
		char	myChar;				// 2byte
		
		my_int = 10;
		my_long = 10L;
		my_short = 100;
		my_byte = 10;
		
		myChar = '0';		// 아스키 48
		myChar = '8';		// 아스키 56
		
		myBoolean = true;
		myBoolean = false;
		
		
		
	}

}
