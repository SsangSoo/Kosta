package sec04;

public class PrintfDemo {
	public static void main(String[] args) {
		
		int i = 97;
		String str = "Java";
		double f = 3.14f;		// doubleŸ�Կ� float ����.
		
		int t = Math.abs(-10); 
		
		System.out.printf(" %d%n %f%n %o%n %c%n %s%n %e%n", 10, 20.0, 30, 97, 50, 70.2);	
//		10 20.0 36 '�ƽ�Ű40��' "50" 7.020000e+01
//		int���� float�� �־ ����.(�ι�° 20�� 20.0����..)
//		%n  => ���๮��(��ٲ�)
			
		System.out.printf("%o%n", i);		// 141	8����
		System.out.printf("%x%n", i);		// 61   16����
		System.out.printf("%05d%n", i);		// 00097 
		System.out.printf("%s%n", str);		// Java
		System.out.printf("%5s%n", str);	//  Java
		System.out.printf("%-5s%n", str); 	// Java
		System.out.printf("%f%n", f); 		// 3.14
		System.out.printf("%e%n", f); 		// 3.14+E1 (?)  > 3.140000e+00 // �������� ( %g�� ����.. ������)
//		
//		�ڸ����� �Ҽ��� ����.
		System.out.printf("%4.1f%n", f); 	//  3.1	 4ĭ �� �Ҽ����� ���ڸ�. ������ ����
		System.out.printf("%04.1f%n", f); 	// 03.1	 4ĭ �� ������ ��ĭ 0���� ä��
		System.out.printf("%-4.1f%n", f); 	// 3.1	 4ĭ �� �Ҽ����� ���ڸ�. ���� ����
		
		
	}
}