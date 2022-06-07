package chap02;

public class CastDemo {
	public static void main(String[] args) {
		int i; double d; byte b; long l;
		System.out.println(Byte.MAX_VALUE);		// 127
		System.out.println(Integer.MAX_VALUE);	// 21억
		System.out.println(Byte.MIN_VALUE);		// -128
		System.out.println(Integer.MIN_VALUE);	// -21억
		
		System.out.println();
		
		i = 7 / 4;  			// 1
		System.out.println(i);
		
		d = 7 / 4.0;
//		d = 7 / 4.0 
//		  = 7.0 / 4.0 
//		  = 1.75
		System.out.println(d); 
		
		System.out.println("정수int형 - 최대값 : " + Integer.MIN_VALUE + ", 최소값 : " + Integer.MAX_VALUE);
		System.out.println("정수short형 - 최대값 : " + Short.MIN_VALUE + ", 최소값 : " + Short.MAX_VALUE);
		System.out.println("정수byte형 - 최대값 : " + Byte.MIN_VALUE + ", 최소값 : " + Byte.MAX_VALUE);
		System.out.println("정수long형 - 최대값 : " + Long.MIN_VALUE + ", 최소값 : " + Long.MAX_VALUE);
		
		i = -2147483648;
		
		System.out.println(i);
	
		l = (long)i - 1;
		System.out.println(l);
		
	}
}