package sec05;

public class ComLogicDemo {

	public static void main(String[] args) {
		
		int x = 0, y = 1;
		
		System.out.println((x < 1) && (y-- < 1));
//		y-- > 위 식에서 y = 1, 그리고 연산 후에 -- 가 적용되서 
//		10번 라인 이후로 0이 된다.
		
		
/*
 * 전위 연산자(= 증감 연산자가 앞에 붙은 것)
 * ex) ++y;
 * int i = ++y;
 * 위 증감식을 두개의 식으로 분리하면
 * y = y + 1;
 * int i = y;	
 *
 * 후위 연산자(= 증감 연산자가 뒤에 붙은 것)
 * ex) y++;
 * int i = y++;
 * 위 증감식을 두개의 식으로 분리하면
 * int i = y;
 * y = y + 1;
 *		
 */
	
	}
}