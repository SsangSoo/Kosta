package chap02;

public class CastDemo {
	public static void main(String[] args) {
		int i; double d; byte b; long l;
		System.out.println(Byte.MAX_VALUE);		// 127
		System.out.println(Integer.MAX_VALUE);	// 21��
		System.out.println(Byte.MIN_VALUE);		// -128
		System.out.println(Integer.MIN_VALUE);	// -21��
		
		System.out.println();
		
		i = 7 / 4;  			// 1
		System.out.println(i);
		
		d = 7 / 4.0;
//		d = 7 / 4.0 
//		  = 7.0 / 4.0 
//		  = 1.75
		System.out.println(d); 
		
		System.out.println("����int�� - �ִ밪 : " + Integer.MIN_VALUE + ", �ּҰ� : " + Integer.MAX_VALUE);
		System.out.println("����short�� - �ִ밪 : " + Short.MIN_VALUE + ", �ּҰ� : " + Short.MAX_VALUE);
		System.out.println("����byte�� - �ִ밪 : " + Byte.MIN_VALUE + ", �ּҰ� : " + Byte.MAX_VALUE);
		System.out.println("����long�� - �ִ밪 : " + Long.MIN_VALUE + ", �ּҰ� : " + Long.MAX_VALUE);
		
		i = -2147483648;
		
		System.out.println(i);
	
		l = (long)i - 1;
		System.out.println(l);
		
	}
}