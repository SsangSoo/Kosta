package chap02_prac;

public class prac05 {
	public static void main(String[] args) {
		
	char c = 'c';
	
	System.out.println((char)(c + ((int)'A' - (int)'a')));
	//	'A' - 'a' = 65 - 97  = -32 를 더하면 대문자됨(음수를 더함)
	}
}