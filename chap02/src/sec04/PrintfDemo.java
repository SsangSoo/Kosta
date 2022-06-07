package sec04;

public class PrintfDemo {
	public static void main(String[] args) {
		
		int i = 97;
		String str = "Java";
		double f = 3.14f;		// double타입에 float 저장.
		
		int t = Math.abs(-10); 
		
		System.out.printf(" %d%n %f%n %o%n %c%n %s%n %e%n", 10, 20.0, 30, 97, 50, 70.2);	
//		10 20.0 36 '아스키40번' "50" 7.020000e+01
//		int형을 float에 넣어서 예외.(두번째 20을 20.0으로..)
//		%n  => 개행문자(행바꿈)
			
		System.out.printf("%o%n", i);		// 141	8진수
		System.out.printf("%x%n", i);		// 61   16진수
		System.out.printf("%05d%n", i);		// 00097 
		System.out.printf("%s%n", str);		// Java
		System.out.printf("%5s%n", str);	//  Java
		System.out.printf("%-5s%n", str); 	// Java
		System.out.printf("%f%n", f); 		// 3.14
		System.out.printf("%e%n", f); 		// 3.14+E1 (?)  > 3.140000e+00 // 지수형태 ( %g도 있음.. 간편히)
//		
//		자리수에 소수점 포함.
		System.out.printf("%4.1f%n", f); 	//  3.1	 4칸 중 소수점은 한자리. 오른쪽 정렬
		System.out.printf("%04.1f%n", f); 	// 03.1	 4칸 중 정수부 빈칸 0으로 채움
		System.out.printf("%-4.1f%n", f); 	// 3.1	 4칸 중 소수점은 한자리. 왼쪽 정렬
		
		
	}
}