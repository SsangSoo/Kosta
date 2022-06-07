package chap02;

public class CharBoolDemo {
	public static void main(String[] args) {
		System.out.println("Hello");	// 
		System.out.println((int)'H');	// H 아스키코드 72
		System.out.println((char)72);	// 72를 문자형으로 형변환
		System.out.println((int)'가');	// '가' 아스키코드 44032
		System.out.println((char)44032);
		
		boolean cham = true; 
		boolean geogit = false;
		System.out.println(cham + ", " +  geogit); // ", "에 의해서 String으로 형변환.
		
		System.out.println((int)'가'+2);		// 44034
		System.out.println((char)44034);	// '갂'
		System.out.println((int)'다');		// 45796
		System.out.println((char)45796);	// '다'
	}
}
